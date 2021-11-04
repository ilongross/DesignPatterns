package com.ilongross.patterns.gof.behavioral.state.state_command;

public class NewState extends DocumentState{
    public NewState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("We are already in new!");
        return false;
    }

    @Override
    public boolean onReconsiliation() {
        System.out.println("Going to reconsiliation");
        return false;
    }

    @Override
    public boolean onApprove() {
        System.out.println("First, go to reconsiliation");
        document.setDocumentState(new ApproveState(document));
        return true;
    }

    @Override
    public boolean onReject() {
        System.out.println("First, go to reconsiliation");
        return false;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Going to delete");
        document.setDocumentState(new DeleteState(document));
        return true;
    }
}
