package com.ilongross.patterns.behavioral.visitor;

public class OwnerVisitor implements OrganizationVisitor{
    @Override
    public void visit(Organization organization) {
        System.out.println(organization);
    }
}
