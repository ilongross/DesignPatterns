package com.ilongross.patterns.home_works.lab1;

import java.util.List;

public class Directory implements FSItem{

    private String name;
    private List<FSItem> children;

    public Directory(List<FSItem> children) {
        this.children = children;
    }

    public List<FSItem> getChildren() {
        return children;
    }
    public boolean isFileSystem() {
        return this.children == FS.getEntryList();
    }

    @Override
    public String getPath() {
        return this.toString();
    }
    @Override
    public FSItem getParent() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
