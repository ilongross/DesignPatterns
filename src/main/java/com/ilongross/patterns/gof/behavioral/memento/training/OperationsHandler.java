package com.ilongross.patterns.gof.behavioral.memento.training;

import java.util.HashMap;
import java.util.Map;

public class OperationsHandler {

    private Map<Integer, SystemOperation.Snapshot> snapshots = new HashMap<>();

    public void saveCondition(SystemOperation operation) throws Exception {
        var day = operation.save().getDaySnap();
        if(!snapshots.containsKey(day)) {
            snapshots.put(operation.save().getDaySnap(), operation.save());
        } else {
            throw new Exception("This day already saved");
        }
    }

    public SystemOperation restoreOperation(int day) {
        var op = new SystemOperation();
        op.restore(snapshots.get(day));
        return op;
    }

}
