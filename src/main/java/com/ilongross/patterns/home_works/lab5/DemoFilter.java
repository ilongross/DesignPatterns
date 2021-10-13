package com.ilongross.patterns.home_works.lab5;

public class DemoFilter {
    public static void main(String[] args) {
        var request1 = new RequestForEnter("self-service", "stable", 9000567, "admin", "21343535ff4ff", "https");

        var schar = new SecurityContextHolderAwareRequestFilter(null, request1);
        var upa = new UsernamePasswordAuthenticationFilter(schar, request1);
        var cs = new ConcurrentSessionFilter(upa, request1);
        var cp = new ChannelProcessingFilter(cs, request1);

        cp.checkClientRequest();

    }
}
