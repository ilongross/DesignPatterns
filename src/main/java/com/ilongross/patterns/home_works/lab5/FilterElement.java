package com.ilongross.patterns.home_works.lab5;

public abstract class FilterElement {

    protected FilterElement nextStage;
    protected RequestForEnter request;

    public FilterElement(FilterElement nextStage, RequestForEnter request) {
        this.nextStage = nextStage;
        this.request = request;
    }

    public abstract boolean checkClientRequest();


}
