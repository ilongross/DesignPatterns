package com.ilongross.patterns.behavioral.state.state_command;

public class ApproveState extends DocumentState{
    public ApproveState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("We are on approve!");
        return false;
    }

    @Override
    public boolean onReconsiliation() {
        System.out.println("Already approved!");
        return false;
    }

    @Override
    public boolean onApprove() {
        System.out.println("Already approved!");
        return false;
    }

    @Override
    public boolean onReject() {
        System.out.println("Already approved!");
        return false;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Going to delete");
        document.setDocumentState(new DeleteState(document));
        return true;
    }
}
