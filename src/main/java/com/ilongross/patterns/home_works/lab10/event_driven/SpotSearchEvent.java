package com.ilongross.patterns.home_works.lab10.event_driven;

import java.util.UUID;

public class SpotSearchEvent implements SpotEvent{
    private int userId;
    private UUID id;
    private short newAge;

    public SpotSearchEvent(int userId, UUID id, short newAge) {
        this.userId = userId;
        this.id = id;
        this.newAge = newAge;
    }

    @Override
    public String toString() {
        return "SpotSearchEvent{" +
                "userId=" + userId +
                ", id=" + id +
                ", newAge=" + newAge +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public short getNewAge() {
        return newAge;
    }

    public void setNewAge(short newAge) {
        this.newAge = newAge;
    }
}
