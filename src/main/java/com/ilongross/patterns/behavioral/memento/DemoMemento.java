package com.ilongross.patterns.behavioral.memento;

public class DemoMemento {
    public static void main(String[] args) {

        var name = "Jaja Patterns";

        var editor = new TextEditor(new StringBuilder(name));
        var careTaker = new TextEditorCareTaker(editor);

        System.out.println(editor.getWholeText());

        careTaker.hitRemove(3);
        careTaker.hitText(2, "v");
        System.out.println(editor.getWholeText());

        careTaker.hitText(5, "Memento ");
        System.out.println(editor.getWholeText());

        careTaker.hitRemove(editor.getWholeText().length());
        System.out.println(editor.getWholeText());

        int startPlaceForRemoveNextBlock = 5;
        for (int i = 0; i < startPlaceForRemoveNextBlock; i++) {
            careTaker.hitRemove(startPlaceForRemoveNextBlock - i);
        }
        System.out.println(editor.getWholeText());


    }
}
