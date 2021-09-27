package com.ilongross.patterns.structural.flyweight;

public class Color {
    private final int code;
    private final String name;

    public Color(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
