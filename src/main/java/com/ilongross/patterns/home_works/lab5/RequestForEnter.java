package com.ilongross.patterns.home_works.lab5;

public class RequestForEnter {

    private String channelName;
    private String threadName;
    private long idSession;
    private String username;
    private String password;
    private String protocol;

    public RequestForEnter(String channelName, String threadName, long idSession, String username, String password, String protocol) {
        this.channelName = channelName;
        this.threadName = threadName;
        this.idSession = idSession;
        this.username = username;
        this.password = password;
        this.protocol = protocol;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getThreadName() {
        return threadName;
    }

    public long getIdSession() {
        return idSession;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProtocol() {
        return protocol;
    }
}
