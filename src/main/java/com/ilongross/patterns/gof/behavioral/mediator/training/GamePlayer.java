package com.ilongross.patterns.gof.behavioral.mediator.training;

public class GamePlayer extends Player{


    public GamePlayer(String name, int dataForSend) {
        super(name, dataForSend);
    }

    @Override
    public int transferData() {
        return dataForSend;
    }

    @Override
    public void receiveData(int value) {
        this.dataForReceive = value;
    }


}
