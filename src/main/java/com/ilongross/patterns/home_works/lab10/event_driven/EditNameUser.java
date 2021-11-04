package com.ilongross.patterns.home_works.lab10.event_driven;

import java.util.UUID;

public class EditNameUser {

    private int id;
    private UUID uuid;
    private String newName;

    public EditNameUser(int id, UUID uuid, String newName) {
        this.id = id;
        this.newName = newName;
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "EditNameUser{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", newName='" + newName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

}
