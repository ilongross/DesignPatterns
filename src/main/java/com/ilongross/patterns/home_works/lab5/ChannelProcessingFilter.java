package com.ilongross.patterns.home_works.lab5;

public class ChannelProcessingFilter extends FilterElement{


    public ChannelProcessingFilter(FilterElement nextStage, RequestForEnter request) {
        super(nextStage, request);
    }

    @Override
    public boolean checkClientRequest() {
        if(nextStage == null)
            return true;
        if(request.getChannelName().equals("self-service"))
            return nextStage.checkClientRequest();
        else {
            System.out.println("Warning: unknown channel");
            return false;
        }
    }
}
