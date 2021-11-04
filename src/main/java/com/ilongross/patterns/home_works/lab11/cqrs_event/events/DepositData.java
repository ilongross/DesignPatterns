package com.ilongross.patterns.home_works.lab11.cqrs_event.events;

import com.ilongross.patterns.cqrs_event.event_sourcing.EventData;

public class DepositData extends EventData {
    private final float appendBalance;

    public DepositData(float appendBalance) {
        this.appendBalance = appendBalance;
    }

    public float getAppendBalance() {
        return appendBalance;
    }
}
