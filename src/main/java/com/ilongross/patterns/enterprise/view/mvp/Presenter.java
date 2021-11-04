package com.ilongross.patterns.enterprise.view.mvp;

import java.util.ArrayList;
import java.util.List;

public class Presenter {

    private List<View> views;
    private Model model;

    public Presenter() {
        views = new ArrayList<>();
    }

    public void addView(View view) {
        views.add(view);
    }

    public void populateData(String data) {
        if(!data.isEmpty()) {
            views.stream().forEach(v -> v.showData(data));
        }
    }

    public void processData(String newText) {
        model.setData(newText);
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
