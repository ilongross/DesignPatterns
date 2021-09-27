package com.ilongross.patterns.generative.home_work.ex2_abstract_factory;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.factory.*;

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
