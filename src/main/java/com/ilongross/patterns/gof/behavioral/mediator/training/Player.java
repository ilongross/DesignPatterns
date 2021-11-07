package com.ilongross.patterns.gof.behavioral.mediator.training;

public abstract class Player {

    private String name;
    public int dataForSend;
    public int dataForReceive;

    public Player(String name, int dataForSend) {
        this.name = name;
        this.dataForSend = dataForSend;
    }

    public abstract int transferData();
    public abstract void receiveData(int value);

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", dataForSend=" + dataForSend +
                ", dataForReceive=" + dataForReceive +
                '}';
    }
}
