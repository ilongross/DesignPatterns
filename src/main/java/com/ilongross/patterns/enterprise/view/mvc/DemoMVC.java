package com.ilongross.patterns.enterprise.view.mvc;

public class DemoMVC {

    public static void main(String[] args) {
        var model = new Model();
        var view = new View();
        var controller = new Controller();

        view.setModel(model);
        view.setController(controller);
        controller.setModel(model);
        controller.setView(view);

        controller.appendText("Ilon");
        controller.clearText();
        controller.appendText("Gross");

    }



}
