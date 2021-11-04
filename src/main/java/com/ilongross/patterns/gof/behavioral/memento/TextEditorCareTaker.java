package com.ilongross.patterns.gof.behavioral.memento;

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

    public void hitText(int cursorPlace, String text) {
        textEditor.setCursor(cursorPlace);
        textEditor.appendText(text);
    }

    public void hitRemove(int cursorPlace) {
        textEditor.setCursor(cursorPlace);
        textEditor.removeText(1);
    }

    public void hitSave() {
        history.add(originator.save());
    }

    public void undo() {
        originator.setPreviousState(textEditor);
        originator.restore(history.get(history.size() - 1));
        history.remove(history.size() - 1);
    }

    public void redo() {
        var editor = textEditor;
        textEditor = originator.getPreviousState();
        originator.setPreviousState(editor);
        history.add(new TextEditorMemento(textEditor.getWholeText().toString()));
    }


}
