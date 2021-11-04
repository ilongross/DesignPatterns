package com.ilongross.patterns.enterprise.view.mvvm;

import java.util.ArrayList;
import java.util.List;

public class ViewModel {

    private Model model;
    private List<View> views;


    public ViewModel() {
        views = new ArrayList<>();
    }

    public void addView(View view) {
        views.add(view);
    }

    public String requestData() {
       String data = model.getData();
       if(!data.isEmpty()) {
           return data;
       } else {
           return "No data now";
       }
    }

    public void changeData(String newData) {
        if(!newData.isEmpty()) {
            model.setData(newData);
            views.stream().forEach(View::requestPage);
        }
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
