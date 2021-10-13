package com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid;

public class NewOperation extends DocumentOperation {
    @Override
    public boolean execute() {
            System.out.println("Created!");
            return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onNew();
    }
}
