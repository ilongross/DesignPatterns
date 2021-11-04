package com.ilongross.patterns.event_sourcing;

import com.ilongross.patterns.event_sourcing.events.*;

import java.time.Instant;
import java.util.*;

public class AccountService {

    private TreeSet<AccountEvent> eventTreeSet = new TreeSet<>();
    private Random rand = new Random();
    private Map<Integer, Integer> eventAccountCountMap = new HashMap<>();
    private Map<Integer, Account> accountSnapshotMap = new HashMap<>();

    public void createAccount(int id, String owner) {
        var event = new AccountEvent(
                AccountEventType.CREATE,
                id,
                new CreateData(id, owner)
        );
        eventTreeSet.add(event);
    }

    public void addMoney(int id, float money) {
        var event = new AccountEvent(
                AccountEventType.DEPOSIT,
                id,
                new DepositData(money)
        );
        eventTreeSet.add(event);
    }

    public void withdrawMoney(int id, float money) {
        var event = new AccountEvent(
                AccountEventType.WITHDRAW,
                id,
                new WithdrawData(money)
        );
        eventTreeSet.add(event);
    }

    public void closeAccount(int id) {
        var event = new AccountEvent(
                AccountEventType.CLOSE,
                id,
                new CloseData("old transaction")
        );
        eventTreeSet.add(event);
    }

    public void changeOwner(int id, String newOwner) {
        var event = new AccountEvent(
                AccountEventType.CHANGE_OWNER,
                id,
                new ChangeOwnerData(newOwner)
        );
        eventTreeSet.add(event);
    }

    public Account getAccount(int id) {
        Account acc = null;
        for (AccountEvent event : eventTreeSet) {
            if(event.getEntityId() == id) {

                if(accountSnapshotMap.containsKey(id)) {
                    var snapshot = accountSnapshotMap.get(id);
                    if(snapshot.getLastUpdateDate().after(event.getEventDate())) {
                        acc = snapshot;
                        continue;
                    }
                }


//                switch (event.getType()) {
//                    case CREATE -> {
//                        var createData = (CreateData) event.getEventData();
//                        acc = new Account(createData.getAccountId(), createData.getOwner(), event.getEventDate());
//                    }
//                    case DEPOSIT -> {
//                        var depositData = (DepositData) event.getEventData();
//                        acc.setBalance(acc.getBalance() + depositData.getAppendBalance());
//                    }
//                    case WITHDRAW -> {
//                        var withdrawData = (WithdrawData) event.getEventData();
//                        acc.setBalance(acc.getBalance() - withdrawData.getWithdrawBalance());
//                    }
//                    case CHANGE_OWNER -> {
//                        var changeOwnerData = (ChangeOwnerData) event.getEventData();
//                        acc.setOwner(changeOwnerData.getNewOwner());
//                    }
//                    case CLOSE -> {
//                        var closeData = (CloseData) event.getEventData();
//                        acc.setActive(false);
//                    }
//                }
            }
        }

        updateAccountEventCount(id);
        if(eventAccountCountMap.get(id) > 5) {
            acc.setLastUpdateDate(Date.from(Instant.now()));
            accountSnapshotMap.put(id, acc);
            eventAccountCountMap.put(id, 0);
        }

        return acc;
    }

    private void updateAccountEventCount(int id) {
        if(eventAccountCountMap.containsKey(id)) {
            int countOfEvents = eventAccountCountMap.get(id);
            countOfEvents++;
            eventAccountCountMap.put(id, countOfEvents);
        } else {
            eventAccountCountMap.put(id, 1);
        }
    }


    public float getDepositOperationsSumCommand(int id) {
        float sum = 0;
        for (AccountEvent event : eventTreeSet) {
            if(event.getEntityId() == id) {
                if(event.getType().equals(AccountEventType.DEPOSIT)) {
                    var depositData = (DepositData) event.getEventData();
                    sum += depositData.getAppendBalance();
                }
            }
        }
        return sum;
    }


}
