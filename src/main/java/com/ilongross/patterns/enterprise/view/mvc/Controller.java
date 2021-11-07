package com.ilongross.patterns.enterprise.view.mvc;

public class Controller {
    private Model model;
    private View view;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void clearText() {
        model.setData("");
        view.showText();
    }

    public void appendText(String newText) {
        model.setData(model.getData() + newText);
        view.showText();
    }

}
