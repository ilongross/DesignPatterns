package com.ilongross.patterns.gof.generative.factories.builder.training.models;

import java.util.Objects;
import java.util.UUID;

public class CreditContract implements Contract{

    private UUID uuid;
    private float money;
    private float creditPercentRate;
    private int term;

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CreditContract{" +
                "uuid=" + uuid +
                ", money=" + money +
                ", creditPercentRate=" + creditPercentRate +
                ", range=" + term +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditContract that = (CreditContract) o;
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

    public void setCreditPercentRate(float creditPercentRate) {
        this.creditPercentRate = creditPercentRate;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public int compareTo(Object o) {
        Contract c = (Contract) o;
        return Integer.compare(c.hashCode(), o.hashCode());
    }
}
