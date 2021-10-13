package com.ilongross.patterns.home_works.lab5;

public class UsernamePasswordAuthenticationFilter extends FilterElement{

    public UsernamePasswordAuthenticationFilter(FilterElement nextStage, RequestForEnter request) {
        super(nextStage, request);
    }

    @Override
    public boolean checkClientRequest() {
        if(nextStage == null)
            return true;
        if(request.getUsername().equals("admin") && (request.getPassword().length() > 8))
            return nextStage.checkClientRequest();
        else {
            System.out.println("Warning: wrong login/pass");
            return false;
        }
    }
}
