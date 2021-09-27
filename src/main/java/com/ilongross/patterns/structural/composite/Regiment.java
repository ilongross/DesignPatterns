package com.ilongross.patterns.structural.composite;

public class Regiment extends SoldierCounter{

    private int soldiers;

    public Regiment(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public int countSoldiers() {
        return soldiers;
    }
}
