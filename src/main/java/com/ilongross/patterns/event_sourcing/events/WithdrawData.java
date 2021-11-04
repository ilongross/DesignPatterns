package com.ilongross.patterns.event_sourcing.events;

import com.ilongross.patterns.event_sourcing.EventData;

public class WithdrawData extends EventData {

    private final float withdrawBalance;

    public WithdrawData(float withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }

    public float getWithdrawBalance() {
        return withdrawBalance;
    }
}
