package com.ilongross.patterns.cqrs_event.event_sourcing.events;

import com.ilongross.patterns.cqrs_event.event_sourcing.EventData;

public class UndoData extends EventData {

    private int entityId;

    public UndoData(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityId() {
        return entityId;
    }
}
