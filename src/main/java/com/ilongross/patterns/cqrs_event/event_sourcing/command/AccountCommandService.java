package com.ilongross.patterns.cqrs_event.event_sourcing.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.Account;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEventType;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.*;

import java.time.Instant;
import java.util.*;

public class AccountCommandService {

    private List<AccountCommand> accountCommandList = new LinkedList<>();
    private Random rand = new Random();
    private AccountQueryService accountQueryService;

    public AccountCommandService(AccountQueryService accountQueryService) {
        this.accountQueryService = accountQueryService;
    }

    public void createAccount(int id, String owner) {
        var command = new CreateAccountCommand(id, owner);
        accountCommandList.add(command);
        accountQueryService.processEvent(command.apply());
    }

    public void addMoney(int id, float money) {
        var command = new AppendMoneyCommand(id, money);
        accountCommandList.add(command);
        accountQueryService.processEvent(command.apply());
    }

    public void withdrawMoney(int id, float money) {
        var command = new WithdrawMoneyCommand(id, money);
        accountCommandList.add(command);
        accountQueryService.processEvent(command.apply());
    }

    public void closeAccount(int id) {
        var command = new CloseAccountCommand(id);
        accountCommandList.add(command);
        accountQueryService.processEvent(command.apply());
    }

    public void changeOwner(int id, String newOwner) {
        var command = new ChangeOwnerCommand(id, newOwner);
        accountCommandList.add(command);
        accountQueryService.processEvent(command.apply());
    }

    public void reprocessAccAccounts() {
        accountQueryService.clear();
        for (AccountCommand command : accountCommandList) {
            accountQueryService.processEvent(command.apply());
        }
    }

}
