package com.ilongross.patterns.home_works.lab5;

public class ConcurrentSessionFilter extends FilterElement{


    public ConcurrentSessionFilter(FilterElement nextStage, RequestForEnter request) {
        super(nextStage, request);
    }

    @Override
    public boolean checkClientRequest() {
        if(nextStage == null)
            return true;
        if(request.getThreadName().contains("stable") && (request.getIdSession() > 10000))
            return nextStage.checkClientRequest();
        else {
            System.out.println("Warning: wrong connection params");
            return false;
        }
    }
}
