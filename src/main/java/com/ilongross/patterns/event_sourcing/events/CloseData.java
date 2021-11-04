package com.ilongross.patterns.event_sourcing.events;

import com.ilongross.patterns.event_sourcing.EventData;

public class CloseData extends EventData {

    private final String reason;

    public CloseData(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
