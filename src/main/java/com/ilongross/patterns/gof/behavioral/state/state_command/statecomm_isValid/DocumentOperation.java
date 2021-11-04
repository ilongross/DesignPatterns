package com.ilongross.patterns.gof.behavioral.state.state_command.statecomm_isValid;

public abstract class DocumentOperation {

    Document document; // As command runner

    public abstract boolean execute();
    public abstract boolean isValid();

}
