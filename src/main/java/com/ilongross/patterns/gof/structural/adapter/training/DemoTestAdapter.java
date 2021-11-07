package com.ilongross.patterns.gof.structural.adapter.training;

public class DemoTestAdapter {
    public static void main(String[] args) {
        var resXML = new ResourcesXML();
        var resJSON = new ResourcesJSON();

        var xml1 = new FileXML("xml_1", "<name>first</name>");
        var xml2 = new FileXML("xml_2", "<name>second</name>");
        var xml3 = new FileXML("xml_3", "<name>third</name>");
        var xml4 = new FileXML("xml_4", "<name>fourth</name>");

        var jsonAdapter1 = new AdapterJSON(xml1.getTitle(), xml1.getData()).getJSON();
        var jsonAdapter2 = new AdapterJSON(xml2.getTitle(), xml2.getData()).getJSON();
        var jsonAdapter3 = new AdapterJSON(xml3.getTitle(), xml3.getData()).getJSON();
        var jsonAdapter4 = new AdapterJSON(xml4.getTitle(), xml4.getData()).getJSON();

        resXML.addXML(xml1);
        resXML.addXML(xml2);
        resXML.addXML(xml3);
        resXML.addXML(xml4);

        resJSON.addJSON(jsonAdapter1);
        resJSON.addJSON(jsonAdapter2);
        resJSON.addJSON(jsonAdapter3);
        resJSON.addJSON(jsonAdapter4);

        resXML.showResources();
        resJSON.showResources();


    }
}
