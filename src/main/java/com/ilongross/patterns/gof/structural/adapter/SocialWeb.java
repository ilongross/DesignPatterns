package com.ilongross.patterns.gof.structural.adapter;

import java.util.List;

public interface SocialWeb {

    List<String> getUserFriends(String userId);
    void postToWall(String userId, String wallPost);
    double appendMoneyToBalance (String uuid, double money);

}
