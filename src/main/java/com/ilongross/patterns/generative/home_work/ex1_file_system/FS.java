package com.ilongross.patterns.generative.home_work.ex1_file_system;

import java.util.LinkedList;
import java.util.List;

public class FS {

    private List<FSItem> entryList = new LinkedList<>();

    private FS() {
    }

    public static List<FSItem> getEntryList() {
        return FSHolder.INSTANCE.entryList;
    }


    private static class FSHolder {
        public static final FS INSTANCE = new FS();
    }


}
