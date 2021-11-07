package com.ilongross.patterns.gof.structural.adapter.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourcesXML {

    private Map<String, FileXML> mapXML = new HashMap();

    public void addXML(FileXML fileXML) {
        if (mapXML.containsKey(fileXML.getTitle())) {
            return;
        }
        else {
            mapXML.put(fileXML.getTitle(), fileXML);
        }
    }

    public FileXML getXml(String title) {
        return mapXML.get(title);
    }

    public void showResources() {
        for (String title : mapXML.keySet()) {
            System.out.println(mapXML.get(title));
        }
    }

}
