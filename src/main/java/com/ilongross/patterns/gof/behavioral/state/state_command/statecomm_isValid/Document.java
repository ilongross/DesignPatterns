package com.ilongross.patterns.gof.behavioral.state.state_command.statecomm_isValid;

import com.ilongross.patterns.gof.behavioral.state.state_command.DocumentState;

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
        if(documentOperation.isValid()){
            documentOperation.execute();
        }
        return false;
    }

}
