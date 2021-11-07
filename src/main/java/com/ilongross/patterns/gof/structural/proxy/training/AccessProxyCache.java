package com.ilongross.patterns.gof.structural.proxy.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccessProxyCache implements ActualAccess{

    private final ActualAccess access;
    private final List<Integer> tokens = new ArrayList<>();

    public AccessProxyCache(ActualAccess access) {
        this.access = access;
    }




    @Override
    public int getActualToken() {
        if(tokens.size() < 5) {
            int token = access.getActualToken();
            tokens.add(token);
            return token;
        }
        var rand = new Random();
        return tokens.get(rand.nextInt(5));
    }
}
