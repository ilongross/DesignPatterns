package com.ilongross.patterns.home_works.lab8;

public class TextEditorOriginator {

    private TextEditor textEditor;
    private TextEditor previousState;

    public TextEditorOriginator(TextEditor textEditor) {
        this.textEditor = textEditor;
        previousState = textEditor;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(textEditor.getWholeText().toString());
    }

    public void restore(TextEditorMemento memento) {
        textEditor.setWholeText(new StringBuilder(memento.getCurrentText()));
    }

    public void setPreviousState(TextEditor previousState) {
        this.previousState = previousState;
    }

    public TextEditor getPreviousState() {
        return previousState;
    }
}
