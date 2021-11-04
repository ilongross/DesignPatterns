package com.ilongross.patterns.home_works.lab10.event_driven;

import java.util.UUID;

public class SpotEditNameEvent implements SpotEvent{

    private int userId;
    private UUID id;
    private String newName;

    public SpotEditNameEvent(int userId, UUID id, String newName) {
        this.userId = userId;
        this.id = id;
        this.newName = newName;
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

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public String toString() {
        return "SpotEditNameEvent{" +
                "userId=" + userId +
                ", id=" + id +
                ", newName='" + newName + '\'' +
                '}';
    }
}
