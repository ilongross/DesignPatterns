package com.ilongross.patterns.home_works.lab11.cqrs_event.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

public abstract class AccountCommand {

    private final int id;
    private final int entityId;
//    private AccountCommandType accountCommandType;
    private Date commandDate;
    private static Random rand = new Random();

    public AccountCommand(int entityId) {
        this.id = rand.nextInt();
        this.entityId = entityId;
//        this.accountCommandType = accountCommandType;
        this.commandDate = Date.from(Instant.now());
    }

    public int getId() {
        return id;
    }

    public int getEntityId() {
        return entityId;
    }

    protected abstract AccountEvent apply();

//    public AccountCommandType getAccountCommandType() {
//        return accountCommandType;
//    }

    public Date getCommandDate() {
        return commandDate;
    }



}
