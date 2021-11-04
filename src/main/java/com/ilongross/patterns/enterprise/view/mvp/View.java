package com.ilongross.patterns.enterprise.view.mvp;

public class View {

    private Presenter presenter;

    public void requestChangeText(String newText) {
        presenter.processData(newText);
    }

    public void showData(String data) {
        System.out.println(this.toString() + " showed " + data);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
