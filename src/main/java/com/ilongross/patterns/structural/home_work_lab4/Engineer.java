package com.ilongross.patterns.structural.home_work_lab4;

public class Engineer implements User{

    private String name;
    private int age;
    private String role;

    public Engineer(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
