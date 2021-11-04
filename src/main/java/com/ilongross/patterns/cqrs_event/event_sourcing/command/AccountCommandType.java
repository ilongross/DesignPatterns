package com.ilongross.patterns.cqrs_event.event_sourcing.command;

public enum AccountCommandType {
    CREATE,
    DEPOSIT,
    WITHDRAW,
    CHANGE_OWNER,
    CLOSE
}
