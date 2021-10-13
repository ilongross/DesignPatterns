package com.ilongross.patterns.behavioral.state.state_command.command;

public class ApproveOperation extends DocumentOperation{
    @Override
    public boolean execute() {

        if(document.getDocumentState().onApprove()) {
            System.out.println("Approved!");
            return true;
        }
        return false;
    }
}
