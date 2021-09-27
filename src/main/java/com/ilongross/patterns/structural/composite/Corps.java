package com.ilongross.patterns.structural.composite;

public class Corps extends SoldierCounter{

    private int countOfGeneral;

    public Corps(int countOfGeneral) {
        this.countOfGeneral = countOfGeneral;
    }

    public void addDivision(Division division) {
        counterList.add(division);
    }

    @Override
    public int countSoldiers() {
        return super.countSoldiers() + countOfGeneral;
    }
}
