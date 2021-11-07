package com.ilongross.patterns.gof.generative.factories.builder.training.builders;

import com.ilongross.patterns.gof.generative.factories.builder.training.models.CreditContract;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CreditContractBuilder {

    private UUID uuid;
    private float money;
    private float creditRate;
    private int term;

    private List<String> listErrors = new ArrayList<>();

    private CreditContractBuilder setUUID() {
        this.uuid = UUID.randomUUID();
        return this;
    }

    public CreditContractBuilder setCreditSum(float creditSum) {
        if(creditSum < 10000.00F) {
            listErrors.add("Wrong credit sum. (Must be >= 10000.00)");
        } else {
            this.money = creditSum;
        }
        return this;
    }

    public CreditContractBuilder setCreditRate(float creditRate) {
        if(creditRate < 8.00F || creditRate > 20.00F) {
            listErrors.add("Credit rate must be more than 8% and less than 20%");
        } else {
            this.creditRate = creditRate;
        }
        return this;
    }

    public CreditContractBuilder setCreditTerm(int years) {
        if(years < 1) {
            listErrors.add("Credit years must be more than 1 year.");
        } else {
            this.term = years;
        }
        return this;
    }

    public CreditContract createCreditContract() throws Exception {
        if(listErrors.size() == 0) {
            var credit = new CreditContract();
            setUUID();
            credit.setUuid(this.uuid);
            credit.setMoney(this.money);
            credit.setCreditPercentRate(this.creditRate);
            credit.setTerm(this.term);
            return credit;
        } else {
            throw new Exception(listErrors.stream().collect(Collectors.joining("; ", "(", ")")));
        }
    }


}
