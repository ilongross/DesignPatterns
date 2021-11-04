package com.ilongross.patterns.enterprise.view.page_controller;

public class DemoPageController {
    public static void main(String[] args) {

        var model = new Model();
        var pageContr = new PageController();
        pageContr.setModel(model);

        pageContr.displayViewWithText("admin");
        pageContr.displayViewWithText("adm");
        pageContr.displayViewWithText("admin");



    }
}
