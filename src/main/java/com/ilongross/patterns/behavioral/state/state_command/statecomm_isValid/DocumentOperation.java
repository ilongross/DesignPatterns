package com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid;

import com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid.Document;

public abstract class DocumentOperation {

    Document document; // As command runner

    public abstract boolean execute();
    public abstract boolean isValid();

}
