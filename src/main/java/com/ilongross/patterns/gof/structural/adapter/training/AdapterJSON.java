package com.ilongross.patterns.gof.structural.adapter.training;

public class AdapterJSON extends FileXML {

    public AdapterJSON(String title, String data) {
        super(title, data);
    }

    public FileJSON getJSON() {
        String jsonTitle = "{\"title\": \"" + getTitle() + "\", ";
        String parseData = getData().split(">")[1].split("<")[0];
        String jsonBody = jsonTitle + "\"name\": \"" + parseData + "\"}";
        var json = new FileJSON(jsonBody);
        return json;
    }

}
