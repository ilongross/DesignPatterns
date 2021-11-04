package com.ilongross.patterns.event_sourcing.events;

import com.ilongross.patterns.event_sourcing.EventData;

public class DepositData extends EventData {
    private final float appendBalance;

    public DepositData(float appendBalance) {
        this.appendBalance = appendBalance;
    }

    public float getAppendBalance() {
        return appendBalance;
    }
}
