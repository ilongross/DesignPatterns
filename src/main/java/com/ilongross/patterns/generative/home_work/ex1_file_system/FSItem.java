package com.ilongross.patterns.generative.home_work.ex1_file_system;

public interface FSItem {
    String getName();
    void setName(String name);
    String getPath();
    FSItem getParent();
}
