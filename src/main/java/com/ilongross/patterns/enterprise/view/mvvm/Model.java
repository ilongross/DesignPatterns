package com.ilongross.patterns.enterprise.view.mvvm;

public class Model {

    private String currentText;

    public String getData() {
        return currentText;
    }

    public void setData(String newData) {
        currentText = newData;
    }

}
