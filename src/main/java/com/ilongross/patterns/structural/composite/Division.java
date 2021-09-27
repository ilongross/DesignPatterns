package com.ilongross.patterns.structural.composite;

public class Division extends SoldierCounter{

    private int countOfColonel;

    public Division(int countOfColonel) {
        this.countOfColonel = countOfColonel;
    }

    public void addRegiment(Regiment regiment) {
        counterList.add(regiment);
    }

    @Override
    public int countSoldiers() {
        return super.countSoldiers() + countOfColonel;
    }
}
