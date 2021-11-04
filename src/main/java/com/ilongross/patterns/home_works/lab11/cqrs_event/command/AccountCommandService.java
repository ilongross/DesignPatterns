package com.ilongross.patterns.home_works.lab11.cqrs_event.command;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
