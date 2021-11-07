package com.ilongross.patterns.gof.generative.factories.builder.training.builders;

import com.ilongross.patterns.gof.generative.factories.builder.training.models.SavingsContract;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class SavingsContractBuilder {

    private UUID uuid;
    private float startMoney;
    private float percentRate;
    private Date closeDate;

    private List<String> listErrors = new ArrayList<>();

    private SavingsContractBuilder setUUID() {
        this.uuid = UUID.randomUUID();
        return this;
    }

    public SavingsContractBuilder setStartSum(float startSum) {
        if(startSum < 10000.00F) {
            listErrors.add("Start sum must be more than 10000.00");
        } else {
            this.startMoney = startSum;
        }
        return this;
    }

    public SavingsContractBuilder setPercentRate(float rate) {
        if(rate < 3.00F || rate > 6.00F) {
            listErrors.add("Savings rate must be more than 3% and less then 6%.");
        } else {
            this.percentRate = rate;
        }
        return this;
    }

    public SavingsContractBuilder setCloseDate(int years) {
        if(years < 3) {
            listErrors.add("Duration savings contract must be more than 3 years.");
        } else {
            var date = Date.from(Instant.now());
            date.setYear(date.getYear() + years);
            this.closeDate = date;
        }
        return this;
    }

    public SavingsContract createSavingsContract() throws Exception {
        if(listErrors.size() == 0) {
            var save = new SavingsContract();
            setUUID();
            save.setUuid(this.uuid);
            save.setStartMoney(this.startMoney);
            save.setPercentRate(this.percentRate);
            save.setCloseDate(this.closeDate);
            return save;
        } else {
            throw new Exception(listErrors.stream().collect(Collectors.joining("; ", "(", ")")));
        }
    }

}
