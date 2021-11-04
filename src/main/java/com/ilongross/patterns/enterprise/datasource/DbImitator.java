package com.ilongross.patterns.enterprise.datasource;

import java.util.ArrayList;
import java.util.List;

public class DbImitator {

    public Object getObjectBySQL(String sql) {
        if(sql.contains("Product"))
            return null;
        return null;
    }

    public List<Object> getListObjectBySQL(String sql) {
        return new ArrayList<>();
    }

}
