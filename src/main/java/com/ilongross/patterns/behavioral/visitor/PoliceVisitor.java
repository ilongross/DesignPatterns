package com.ilongross.patterns.behavioral.visitor;

public class PoliceVisitor implements OrganizationVisitor{
    @Override
    public void visit(Organization organization) {
        System.out.println(organization.getDirectorName());
        for (String emp : organization.getEmployees()) {
            System.out.println(emp);
        }

        if(organization instanceof WeaponWareHouse) {
            var wareHouse = (WeaponWareHouse) organization;
            for (String weapon : wareHouse.getWeaponList()) {
                System.out.println(weapon);
            }
        }

    }
}
