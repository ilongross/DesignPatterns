package com.ilongross.patterns.gof.behavioral.state.state_command.command;

public class DeleteOperation extends DocumentOperation{
    @Override
    public boolean execute() {
        if(document.getDocumentState().onDelete()) {
            System.out.println("Deleted!");
            return true;
        }
        return false;
    }
}
