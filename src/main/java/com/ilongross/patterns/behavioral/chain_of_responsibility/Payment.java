package com.ilongross.patterns.behavioral.chain_of_responsibility;

public class Payment {

    private String payer;
    private float sum;
    private String currentStage;
    private String info;

    public Payment(String payer, float sum, String currentStage, String info) {
        this.payer = payer;
        this.sum = sum;
        this.currentStage = currentStage;
        this.info = info;
    }

    public void appendInfo(String newInfo) {
        this.info += newInfo;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payer='" + payer + '\'' +
                ", sum=" + sum +
                ", currentStage='" + currentStage + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
