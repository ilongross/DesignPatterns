package com.ilongross.patterns.enterprise.view.mvp;

public class Model {

    private String data;
    private Presenter presenter;

    public void setData(String data) {
        if(data.equals(this.data)) {
            return;
        }
        this.data = data;
        presenter.populateData(data);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
