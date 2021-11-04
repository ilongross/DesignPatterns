package com.ilongross.patterns.gof.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class WeaponWareHouse extends Organization{

    private List<String> weaponList = new ArrayList<>();

    public WeaponWareHouse(String directorName, List<String> employees, float balance) {
        super(directorName, employees, balance);
    }

    public List<String> getWeaponList() {
        return weaponList;
    }
}
