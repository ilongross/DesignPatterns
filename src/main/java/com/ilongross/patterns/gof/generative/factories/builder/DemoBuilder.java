package com.ilongross.patterns.gof.generative.factories.builder;

import com.ilongross.patterns.gof.generative.factories.builder.training.builders.CreditContractBuilder;
import com.ilongross.patterns.gof.generative.factories.builder.training.builders.DebtContractBuilder;
import com.ilongross.patterns.gof.generative.factories.builder.training.builders.SavingsContractBuilder;
import com.ilongross.patterns.gof.generative.factories.builder.training.models.Contract;
import com.ilongross.patterns.gof.generative.factories.builder.training.models.SavingsContract;

import java.util.ArrayList;

public class DemoBuilder {

    public static void main(String[] args) throws Exception {

        var credit = new CreditContractBuilder()
                .setCreditSum(100000.00F)
                .setCreditRate(12.00F)
                .setCreditTerm(10)
                .createCreditContract();

        var debt = new DebtContractBuilder()
                .setSum(0.00F)
                .setDebtRate(8.00F)
                .createDebtContract();

        var save = new SavingsContractBuilder()
                .setStartSum(10500.00F)
                .setPercentRate(4.00F)
                .setCloseDate(10)
                .createSavingsContract();

        var contracts = new ArrayList<Contract>();
        contracts.add(credit);
        contracts.add(debt);
        contracts.add(save);
        contracts.stream().sorted().forEach(System.out::println);

    }


}
