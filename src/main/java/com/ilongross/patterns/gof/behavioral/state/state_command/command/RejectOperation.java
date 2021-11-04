package com.ilongross.patterns.gof.behavioral.state.state_command.command;

public class RejectOperation extends DocumentOperation{
    @Override
    public boolean execute() {
        if(document.getDocumentState().onReject()) {
            System.out.println("Rejected!");
            return true;
        }
        return false;
    }
}
