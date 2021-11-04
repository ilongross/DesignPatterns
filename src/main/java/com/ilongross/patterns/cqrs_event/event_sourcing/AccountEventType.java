package com.ilongross.patterns.cqrs_event.event_sourcing;

public enum AccountEventType {

    CREATE,
    DEPOSIT,
    WITHDRAW,
    CHANGE_OWNER,
    CLOSE,
    UNDO

}
