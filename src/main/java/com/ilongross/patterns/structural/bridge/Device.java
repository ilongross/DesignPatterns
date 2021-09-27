package com.ilongross.patterns.structural.bridge;

public interface Device {

    boolean isEnabled();
    void disable();
    void enable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}
