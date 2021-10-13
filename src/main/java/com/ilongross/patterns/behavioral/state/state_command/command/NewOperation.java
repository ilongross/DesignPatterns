package com.ilongross.patterns.behavioral.state.state_command.command;

public class NewOperation extends DocumentOperation{
    @Override
    public boolean execute() {
        if(document.getDocumentState().onNew()) {
            System.out.println("Created!");
            return true;
        }
        return false;
    }
}
