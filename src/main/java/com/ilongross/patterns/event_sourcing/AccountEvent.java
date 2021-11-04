package com.ilongross.patterns.event_sourcing;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

public class AccountEvent implements Comparable{

    private final int id;
    private final AccountEventType type;
    private final int entityId;
//    private EventType type; NO need here but NIT only
    private final EventData eventData;
    private final Date eventDate;
    private static Random rand = new Random();

    public AccountEvent(AccountEventType type, int entityId, EventData eventData) {
        this.id = rand.nextInt();
        this.type = type;
        this.entityId = entityId;
        this.eventData = eventData;
        this.eventDate = Date.from(Instant.now());
    }

    public int getId() {
        return id;
    }

    public AccountEventType getType() {
        return type;
    }

    public int getEntityId() {
        return entityId;
    }

    public EventData getEventData() {
        return eventData;
    }

    public Date getEventDate() {
        return eventDate;
    }

    @Override
    public int compareTo(Object o) {
        AccountEvent secondEvent = (AccountEvent) o;
        return this.eventDate.compareTo(secondEvent.eventDate);
    }
}
