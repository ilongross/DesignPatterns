package com.ilongross.patterns.home_works.lab1;

public class File implements FSItem{

    private String name;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return this.toString();
    }

    @Override
    public FSItem getParent() {
        return null;
    }
}
