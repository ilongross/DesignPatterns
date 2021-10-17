package com.ilongross.patterns.home_works.lab7.statecommandupgr_documents;

import com.ilongross.patterns.behavioral.state.state_command.DocumentState;
import com.ilongross.patterns.behavioral.state.state_command.NewState;
import com.ilongross.patterns.behavioral.state.state_command.command.DocumentOperation;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private DocumentState documentState;
    private List<Content> content = new ArrayList<>();

    public Document() {
    }

    public void addContent(Content content) {
        if(documentState instanceof NewState)
            this.content.add(content);
    }

    public DocumentState getDocumentState() {
        return documentState;
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public boolean executeDocumentOperation(DocumentOperation documentOperation) {
        if(documentOperation.execute()) {
            System.out.println("Success");
            return true;
        } else {
            System.out.println("Wrong state!");
            return  false;
        }
    }

}
