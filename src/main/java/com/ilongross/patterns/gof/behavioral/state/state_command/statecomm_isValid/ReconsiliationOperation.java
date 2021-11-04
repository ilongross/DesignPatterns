package com.ilongross.patterns.gof.behavioral.state.state_command.statecomm_isValid;

public class ReconsiliationOperation extends DocumentOperation {
    @Override
    public boolean execute() {
            System.out.println("Reconsiliation!");
            return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onReconsiliation();
    }
}
