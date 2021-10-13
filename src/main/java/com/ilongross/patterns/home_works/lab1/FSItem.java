package com.ilongross.patterns.home_works.lab1;

public interface FSItem {
    String getName();
    void setName(String name);
    String getPath();
    FSItem getParent();
}
