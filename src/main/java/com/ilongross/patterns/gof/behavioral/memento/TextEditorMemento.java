package com.ilongross.patterns.gof.behavioral.memento;

public class TextEditorMemento {

    private final String currentText;

    public TextEditorMemento(String currentText) {
        this.currentText = currentText;
    }

    public String getCurrentText() {
        return currentText;
    }
}
