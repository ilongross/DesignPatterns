package com.ilongross.patterns.home_works.lab2;

import com.ilongross.patterns.home_works.lab2.factory.*;

public class FactoryProducer {

    public Factory createFactory(String databaseType) {
        switch (databaseType) {
            case "obj": return new ObjDbFactory("Objects DB factory");
            case "sql":     return new SqlDbFactory("SQL DB factory");
            case "xml":     return new XmlDbFactory("XML DB factory ");
        }
        return new NullFactory("null");
    }


}
