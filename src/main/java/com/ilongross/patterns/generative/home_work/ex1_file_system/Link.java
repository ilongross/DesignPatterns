package com.ilongross.patterns.generative.home_work.ex1_file_system;

public class Link implements FSItem{

    private String name;
    private FSItem link;


    public FSItem getLink() {
        return link;
    }

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
