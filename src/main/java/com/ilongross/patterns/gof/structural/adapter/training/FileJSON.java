package com.ilongross.patterns.gof.structural.adapter.training;

import java.util.Objects;

public class FileJSON {

    private String body;

    public FileJSON(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "FileJSON{" +
                "body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileJSON fileJSON = (FileJSON) o;
        return body.equals(fileJSON.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
}
