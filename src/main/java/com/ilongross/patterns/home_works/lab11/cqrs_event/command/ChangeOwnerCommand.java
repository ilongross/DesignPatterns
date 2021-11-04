package com.ilongross.patterns.home_works.lab11.cqrs_event.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEventType;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.ChangeOwnerData;

public class ChangeOwnerCommand extends AccountCommand {

    private final String newOwner;

    public ChangeOwnerCommand(int entityId, String newOwner) {
        super(entityId);
        this.newOwner = newOwner;
    }

    public String getNewOwner() {
        return newOwner;
    }

    @Override
    protected AccountEvent apply() {
        var event = new AccountEvent(
                AccountEventType.CHANGE_OWNER,
                getEntityId(),
                new ChangeOwnerData(getNewOwner())
        );
        return event;
    }
}
