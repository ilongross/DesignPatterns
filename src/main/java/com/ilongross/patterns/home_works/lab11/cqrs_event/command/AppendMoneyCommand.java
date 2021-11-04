package com.ilongross.patterns.home_works.lab11.cqrs_event.command;

import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEvent;
import com.ilongross.patterns.cqrs_event.event_sourcing.AccountEventType;
import com.ilongross.patterns.cqrs_event.event_sourcing.events.DepositData;

public class AppendMoneyCommand extends AccountCommand {

    private final float money;

    public AppendMoneyCommand(int entityId, float money) {
        super(entityId);
        this.money = money;
    }


    public float getMoney() {
        return money;
    }

    @Override
    protected AccountEvent apply() {
        var event = new AccountEvent(
                AccountEventType.DEPOSIT,
                getEntityId(),
                new DepositData(getMoney())
        );
        return event;
    }
}
