package com.ilongross.patterns.enterprise.view.mvvm;

public class DemoMVVM {
    public static void main(String[] args) {

        var model = new Model();
        var viewModel = new ViewModel();
        viewModel.setModel(model);

        var view1 = new View();
        view1.setViewModel(viewModel);
        viewModel.addView(view1);

        var view2 = new View();
        view2.setViewModel(viewModel);
        viewModel.addView(view2);

        var view3 = new View();
        view3.setViewModel(viewModel);
        viewModel.addView(view3);

        view1.requestChangeData("Ilon");
        view2.requestPage();
        view3.requestChangeData("Gross");

    }
}
