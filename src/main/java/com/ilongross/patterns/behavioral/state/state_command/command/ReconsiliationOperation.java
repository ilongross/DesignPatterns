package com.ilongross.patterns.behavioral.state.state_command.command;

public class ReconsiliationOperation extends DocumentOperation{
    @Override
    public boolean execute() {
        if(document.getDocumentState().onReconsiliation()) {
            System.out.println("Reconsiliation!");
            return true;
        }
        return false;
    }
}
