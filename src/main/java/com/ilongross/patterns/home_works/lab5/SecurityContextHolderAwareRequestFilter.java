package com.ilongross.patterns.home_works.lab5;

public class SecurityContextHolderAwareRequestFilter extends FilterElement{

    public SecurityContextHolderAwareRequestFilter(FilterElement nextStage, RequestForEnter request) {
        super(nextStage, request);
    }

    @Override
    public boolean checkClientRequest() {
        if(nextStage == null)
            return true;
        if(request.getProtocol().equals("https"))
            return nextStage.checkClientRequest();
        else {
            System.out.println("Warning: unknown protocol");
            return false;
        }
    }
}
