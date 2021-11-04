package com.ilongross.patterns.enterprise.view.mvp;

public class DemoMVP {

    public static void main(String[] args) {
        var model = new Model();

        var view1 = new View();
        var view2 = new View();
        var view3 = new View();

        var presenter = new Presenter();

        model.setPresenter(presenter);
        presenter.setModel(model);
        presenter.addView(view1);
        presenter.addView(view2);
        presenter.addView(view3);

        view1.setPresenter(presenter);
        view2.setPresenter(presenter);
        view3.setPresenter(presenter);

        view1.requestChangeText("view 1");
        view2.requestChangeText("view 2");
        view3.requestChangeText("view 3");
        view3.requestChangeText("view 3");
        view1.requestChangeText("view 1");

    }


}
