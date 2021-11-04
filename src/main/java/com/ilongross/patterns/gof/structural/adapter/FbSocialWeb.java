package com.ilongross.patterns.gof.structural.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FbSocialWeb {

    public Map<UUID, String> getFriendsOfUser(UUID uuid) {
        Map<UUID, String> friends = new HashMap<>();
        friends.put(UUID.randomUUID(), "Alex");
        friends.put(UUID.randomUUID(), "Boris");
        return friends;
    }

    public void postWall(String wallPost, UUID uuid) {
        System.out.println(wallPost + " posted to wall of user" + uuid.toString());
    }

    public double appendMoneyToBalance (UUID uuid, double money) {
        return money - 100;
    }

}
