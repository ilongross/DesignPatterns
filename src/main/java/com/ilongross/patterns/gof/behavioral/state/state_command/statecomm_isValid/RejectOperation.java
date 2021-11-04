package com.ilongross.patterns.gof.behavioral.state.state_command.statecomm_isValid;

public class RejectOperation extends DocumentOperation {
    @Override
    public boolean execute() {
            System.out.println("Rejected!");
            return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onReject();
    }
}
