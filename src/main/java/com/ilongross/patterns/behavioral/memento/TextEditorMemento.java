package com.ilongross.patterns.behavioral.memento;

public class TextEditorMemento {

    private String currentText;

    public TextEditorMemento(String currentText) {
        this.currentText = currentText;
    }

    public String getCurrentText() {
        return currentText;
    }
}
