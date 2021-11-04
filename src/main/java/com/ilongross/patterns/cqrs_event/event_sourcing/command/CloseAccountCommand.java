package com.ilongross.patterns.cqrs_event.event_sourcing.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEventType;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.CloseData;

public class CloseAccountCommand extends AccountCommand{


    public CloseAccountCommand(int entityId) {
        super(entityId);
    }

    @Override
    protected AccountEvent apply() {
        var event = new AccountEvent(
                AccountEventType.CLOSE,
                getEntityId(),
                new CloseData("old transaction")
        );
        return null;
    }
}
