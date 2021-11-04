package com.ilongross.patterns.home_works.lab11.cqrs_event.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEventType;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.UndoData;

public class UndoByEntityIdCommand extends AccountCommand {


    public UndoByEntityIdCommand(int entityId) {
        super(entityId);
    }

    @Override
    protected AccountEvent apply() {
        var event = new AccountEvent(
                AccountEventType.UNDO,
                getEntityId(), new UndoData(getEntityId()));
        return event;
    }
}
