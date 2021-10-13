package com.ilongross.patterns.behavioral.state.state_command;

import com.ilongross.patterns.behavioral.state.state_command.command.*;

public class Document {

    private DocumentState documentState;

    public Document() {
    }

    public DocumentState getDocumentState() {
        return documentState;
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public boolean executeDocumentOperation(DocumentOperation documentOperation) {

//        boolean canDoOperation = false;
//        if(documentOperation instanceof NewOperation) {
//            canDoOperation = getDocumentState().onNew();
//        } else
//            if(documentOperation instanceof ReconsiliationOperation) {
//            canDoOperation = getDocumentState().onReconsiliation();
//        } else
//            if(documentOperation instanceof RejectOperation) {
//            canDoOperation = getDocumentState().onReject();
//        } else
//            if(documentOperation instanceof ApproveOperation) {
//            canDoOperation = getDocumentState().onApprove();
//        } else
//            if(documentOperation instanceof DeleteOperation) {
//            canDoOperation = getDocumentState().onDelete();
//        }
//        if(canDoOperation)
//            return documentOperation.execute();
//        else
//            return false;
        if(documentOperation.execute()) {
            System.out.println("Success");
            return true;
        } else {
            System.out.println("Wrong state!");
            return  false;
        }
    }

}
