package com.ilongross.patterns.behavioral.memento;

import java.util.LinkedList;
import java.util.List;

public class TextEditorCareTaker {

    private TextEditorOriginator originator;
    private TextEditor textEditor;
    private List<TextEditorMemento> history = new LinkedList<>();

    public TextEditorCareTaker(TextEditor textEditor) {
        this.originator = new TextEditorOriginator(textEditor);
        this.textEditor = textEditor;
    }

    public void hitText(String text) {
        textEditor.appendText(text);
    }

    public void hitRemove() {
        textEditor.removeText(1);
    }

    public void hitSave() {
        history.add(originator.save());
    }

    public void undo() {
        originator.restore(history.get(history.size() - 1));
        history.remove(history.size() - 1);
    }

}
