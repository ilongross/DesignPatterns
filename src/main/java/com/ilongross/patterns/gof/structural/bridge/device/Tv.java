package com.ilongross.patterns.gof.structural.bridge.device;

import com.ilongross.patterns.gof.structural.bridge.Device;

public class Tv implements Device {

    private boolean enabled;
    private int volume;
    private int channel = 1;
    private boolean isChildUserNow = false;

    public void setChildUserNow(boolean childUserNow) {
        isChildUserNow = childUserNow;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume >= 100) {
            this.volume = 100;
            return;
        }
        else
        if(this.volume < 0){
            this.volume = 0;
            return;
        }
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if(channel >= 50) {
            this.channel = 50;
            return;
        }
        else
        if(channel < 1) {
            this.channel = 1;
            return;
        }

        if(isChildUserNow && channel == 13) {
            System.out.println("Adult content!!!");
            return;
        }

        this.channel = channel;
    }
}
