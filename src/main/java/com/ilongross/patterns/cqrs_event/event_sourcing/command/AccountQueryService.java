package com.ilongross.patterns.cqrs_event.event_sourcing.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.Account;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AccountQueryService {

    private HashMap<Integer, Account> accounts = new HashMap<>();

    public void processEvent(AccountEvent event) {
        Account acc = null;
//        switch (event.getType()) {
//            case CREATE -> {
//                var createData = (CreateData) event.getEventData();
//                acc = new Account(createData.getAccountId(), createData.getOwner(), event.getEventDate());
//            }
//            case DEPOSIT -> {
//                var depositData = (DepositData) event.getEventData();
//                acc.setBalance(acc.getBalance() + depositData.getAppendBalance());
//            }
//            case WITHDRAW -> {
//                var withdrawData = (WithdrawData) event.getEventData();
//                acc.setBalance(acc.getBalance() - withdrawData.getWithdrawBalance());
//            }
//            case CHANGE_OWNER -> {
//                var changeOwnerData = (ChangeOwnerData) event.getEventData();
//                acc.setOwner(changeOwnerData.getNewOwner());
//            }
//            case CLOSE -> {
//                var closeData = (CloseData) event.getEventData();
//                acc.setActive(false);
//            }
//        }
        accounts.put(event.getEntityId(), acc);
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public List<Account> getActiveAccounts() {
        return accounts.values().stream().filter(Account::isActive).collect(Collectors.toList());
    }

    public void clear() {

    }

}
