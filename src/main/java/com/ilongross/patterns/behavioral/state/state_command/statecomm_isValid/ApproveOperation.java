package com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid;

public class ApproveOperation extends DocumentOperation {
    @Override
    public boolean execute() {
            System.out.println("Approved!");
            return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onApprove();
    }
}
