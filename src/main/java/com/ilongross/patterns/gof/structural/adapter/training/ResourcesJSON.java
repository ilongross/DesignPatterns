package com.ilongross.patterns.gof.structural.adapter.training;

import java.util.*;

public class ResourcesJSON {

    private Map<String, FileJSON> mapJSON = new HashMap();


    public void addJSON(FileJSON json) {
        String header = json.getBody().split(":")[1];
        mapJSON.put(header, json);
    }

    public FileJSON getJSON(String header) throws Exception {
        if(!mapJSON.containsKey(header)) {
            throw new Exception("Wrong header");
        } else {
            return mapJSON.get(header);
        }
    }

    public void showResources() {
        for (String header : mapJSON.keySet()) {
            System.out.println(mapJSON.get(header));
        }
    }


}
