package com.ilongross.patterns.gof.behavioral.memento.training;

import java.util.UUID;

public class SystemOperation {

    private UUID uuid;
    private String data;
    private int day;

    public SystemOperation() {
        this.uuid = UUID.randomUUID();
    }

    public Snapshot save() {
        return new Snapshot();
    }

    public void restore(Snapshot snapshot) {
        this.uuid = snapshot.getIdSnap();
        this.data = snapshot.getDataSnap();
        this.day = snapshot.getDaySnap();
    }

    public void setInfo(int day, String data) {
        this.uuid = UUID.randomUUID();
        this.day = day;
        this.data = data;
    }

    @Override
    public String toString() {
        return new Snapshot().toString();
    }

    public class Snapshot {

        private final UUID idSnap;
        private final String dataSnap;
        private final int daySnap;

        public Snapshot() {
            this.idSnap = uuid;
            this.dataSnap = data;
            this.daySnap = day;
        }

        public UUID getIdSnap() {
            return idSnap;
        }
        public String getDataSnap() {
            return dataSnap;
        }
        public int getDaySnap() {
            return daySnap;
        }

        @Override
        public String toString() {
            return "Snapshot{" +
                    "idSnap=" + idSnap +
                    ", dataSnap='" + dataSnap + '\'' +
                    ", daySnap=" + daySnap +
                    '}';
        }
    }

}
