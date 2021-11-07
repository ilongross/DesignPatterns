package com.ilongross.patterns.gof.behavioral.memento.training;

public class DemoSnapshots {
    public static void main(String[] args) throws Exception {

        var db = new OperationsHandler();

        var op = new SystemOperation();
        op.setInfo(1, "Install MacOS");
        db.saveCondition(op);

        op.setInfo(2, "Install Windows");
        db.saveCondition(op);

        op.setInfo(3, "Install Linux");
        db.saveCondition(op);

        System.out.println(op);
        op = db.restoreOperation(3);
        System.out.println(op);


    }
}
