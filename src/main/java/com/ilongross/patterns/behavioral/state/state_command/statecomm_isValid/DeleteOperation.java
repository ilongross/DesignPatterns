package com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid;

public class DeleteOperation extends DocumentOperation {
    @Override
    public boolean execute() {
            System.out.println("Deleted!");
            return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onDelete();
    }
}
