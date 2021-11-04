package com.ilongross.patterns.home_works.lab11.cqrs_event.events;

import com.ilongross.patterns.cqrs_event.event_sourcing.EventData;

public class CloseData extends EventData {

    private final String reason;

    public CloseData(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
