package com.ilongross.patterns.gof.behavioral.memento;

public class TextEditor {

    private StringBuilder wholeText;
    private int cursor = 0;

    public TextEditor(StringBuilder wholeText) {
        this.wholeText = wholeText;
    }

    public void appendText(String text) {
        if(cursor > wholeText.length()) {
            cursor = wholeText.length();
        }
        var cutPart = "";
        if(cursor < wholeText.length()) {
            cutPart = wholeText.substring(cursor);
            int length = wholeText.length() - cursor;
            for (int i = 0; i < length; i++) {
                if(wholeText.length() == 0)
                    break;
                wholeText.deleteCharAt(wholeText.length() - 1);
            }
        }
        wholeText.append(text);
        wholeText.append(cutPart);
        cursor = wholeText.length();
    }


    public void removeText(int times) {
        if(cursor > wholeText.length()) {
            cursor = wholeText.length();
        }
        var cutPart = "";
        if(cursor < wholeText.length()) {
            cutPart = wholeText.substring(cursor);
            int length = wholeText.length() - cursor;
            for (int i = 0; i < length; i++) {
                if(wholeText.length() == 0)
                    break;
                wholeText.deleteCharAt(wholeText.length() - 1);
            }
        }
        if(wholeText.length() == 0) {
            cursor = 0;
            wholeText.append(cutPart);
            return;
        }
        for (int i = 0; i < times; i++) {
            wholeText.deleteCharAt(wholeText.length() - 1);
        }
        cursor = wholeText.length();
        wholeText.append(cutPart);
    }



    public void setWholeText(StringBuilder wholeText) {
        this.wholeText = wholeText;
    }

    public StringBuilder getWholeText() {
        return wholeText;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }
}
