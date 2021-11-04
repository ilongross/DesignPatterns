package com.ilongross.patterns.enterprise.view.page_controller;

import java.util.HashMap;
import java.util.Map;

public class PageController {

    private Model model;
    private View currentView;
    private Map<String, View> viewMap = new HashMap<>();

    public PageController() {
        viewMap.put("RED", new View("RED"));
        viewMap.put("GREEN", new View("GREEN"));
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void displayViewWithText(String text) {
        if(!model.getText().equals(text)) {
            model.setText(text);

            if(text.equals("admin")) {
                currentView = viewMap.get("GREEN");
            } else {
                currentView = viewMap.get("RED");
            }
            currentView.display();
        } else {
            System.out.println("No need to change view");
        }
    }

}
