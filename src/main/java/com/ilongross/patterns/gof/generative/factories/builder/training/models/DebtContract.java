package com.ilongross.patterns.gof.generative.factories.builder.training.models;

import java.util.Objects;
import java.util.UUID;

public class DebtContract implements Contract{

    private UUID uuid;
    private float money;
    private float percentRate;

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DebtContract{" +
                "uuid=" + uuid +
                ", money=" + money +
                ", percentRate=" + percentRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DebtContract that = (DebtContract) o;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void setPercentRate(float percentRate) {
        this.percentRate = percentRate;
    }

    @Override
    public int compareTo(Object o) {
        Contract c = (Contract) o;
        return Integer.compare(c.hashCode(), o.hashCode());
    }
}
