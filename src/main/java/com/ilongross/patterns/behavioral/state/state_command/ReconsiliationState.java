package com.ilongross.patterns.behavioral.state.state_command;

public class ReconsiliationState extends DocumentState {
    public ReconsiliationState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("We are on reconsiliation");
        return false;
    }

    @Override
    public boolean onReconsiliation() {
        System.out.println("We are already on reconsiliation");
        return false;
    }

    @Override
    public boolean onApprove() {
        System.out.println("Going to approve");
        document.setDocumentState(new ApproveState(document));
        return true;
    }

    @Override
    public boolean onReject() {
        System.out.println("Going to reject");
        document.setDocumentState(new RejectState(document));
        return true;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Going to delete");
        document.setDocumentState(new DeleteState(document));
        return true;
    }
}
