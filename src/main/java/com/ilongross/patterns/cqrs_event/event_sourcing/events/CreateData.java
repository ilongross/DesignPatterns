package com.ilongross.patterns.cqrs_event.event_sourcing.events;

import com.ilongross.patterns.cqrs_event.event_sourcing.EventData;

public class CreateData extends EventData {
    private final int accountId;
    private final String owner;

    public CreateData(int accountId, String owner) {
        this.accountId = accountId;
        this.owner = owner;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOwner() {
        return owner;
    }
}
