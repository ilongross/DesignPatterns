package com.ilongross.patterns.gof.generative.factories.builder.training.models;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class SavingsContract implements Contract{

    private UUID uuid;
    private float startMoney;
    private float percentRate;
    private Date closeDate;

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SavingsContract{" +
                "uuid=" + uuid +
                ", startMoney=" + startMoney +
                ", percentRate=" + percentRate +
                ", closeDate=" + closeDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavingsContract that = (SavingsContract) o;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setStartMoney(float startMoney) {
        this.startMoney = startMoney;
    }

    public void setPercentRate(float percentRate) {
        this.percentRate = percentRate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    @Override
    public int compareTo(Object o) {
        Contract c = (Contract) o;
        return Integer.compare(c.hashCode(), o.hashCode());
    }
}
