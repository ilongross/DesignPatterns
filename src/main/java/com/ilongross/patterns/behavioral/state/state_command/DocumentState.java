package com.ilongross.patterns.behavioral.state.state_command;

public abstract class DocumentState {

    Document document;

    public DocumentState(Document document) {
        this.document = document;
    }

    public abstract boolean onNew();
    public abstract boolean onReconsiliation();
    public abstract boolean onApprove();
    public abstract boolean onReject();
    public abstract boolean onDelete();

}
