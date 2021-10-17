package com.ilongross.patterns.home_works.lab8;

public class TextEditorMemento {

    private String currentText;

    public TextEditorMemento(String currentText) {
        this.currentText = currentText;
    }

    public String getCurrentText() {
        return currentText;
    }
}
