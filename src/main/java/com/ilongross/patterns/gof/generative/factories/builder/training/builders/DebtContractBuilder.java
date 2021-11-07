package com.ilongross.patterns.gof.generative.factories.builder.training.builders;

import com.ilongross.patterns.gof.generative.factories.builder.training.models.DebtContract;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class DebtContractBuilder {

    private UUID uuid;
    private float money;
    private float percentRate;

    private List<String> listErrors = new ArrayList<>();

    private DebtContractBuilder setUUID() {
        this.uuid = UUID.randomUUID();
        return this;
    }

    public DebtContractBuilder setSum(float sum) {
        if(sum < 0) {
            listErrors.add("Sum must be more than 0.");
        } else {
            this.money = sum;
        }
        return this;
    }

    public DebtContractBuilder setDebtRate(float rate) {
        if(rate < 0.00F || rate > 8.00F) {
            listErrors.add("Debt rate must be more than 0% and less than 8%.");
        } else {
            this.percentRate = rate;
        }
        return this;
    }

    public DebtContract createDebtContract() throws Exception {
        if(listErrors.size() == 0) {
            var debt = new DebtContract();
            setUUID();
            debt.setUuid(this.uuid);
            debt.setMoney(this.money);
            debt.setPercentRate(this.percentRate);
            return debt;
        } else {
            throw new Exception(listErrors.stream().collect(Collectors.joining("; ", "(", ")")));
        }
    }




}
