package com.ilongross.patterns.home_works.lab11.cqrs_event.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEventType;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.CreateData;

public class CreateAccountCommand extends AccountCommand {
    private final int entityId;
    private final String ownerName;

    public CreateAccountCommand(int entityId, String ownerName) {
        super(entityId);
        this.entityId = entityId;
        this.ownerName = ownerName;
    }

    public int getEntityId() {
        return entityId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    protected AccountEvent apply() {
        var event = new AccountEvent(
                AccountEventType.CREATE,
                getEntityId(),
                new CreateData(getEntityId(), getOwnerName())
        );
        return event;
    }
}
