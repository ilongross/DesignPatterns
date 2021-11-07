package com.ilongross.patterns.gof.structural.adapter.training;

import java.util.Objects;

public class FileXML {

    private String title;
    private String data;

    public FileXML(String title, String data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "FileXML{" +
                "title='" + title + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileXML fileXML = (FileXML) o;
        return title.equals(fileXML.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
