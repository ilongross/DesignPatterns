package com.ilongross.patterns.gof.structural.bridge.remote;

import com.ilongross.patterns.gof.structural.bridge.Device;
import com.ilongross.patterns.gof.structural.bridge.Remote;

public class BaseRemote implements Remote {

    private Device device;

    public BaseRemote(Device device) {
        this.device = device;
    }

    @Override
    public void toggle() {
        if(device.isEnabled()) {
            device.disable();
        }
        else {
            device.enable();
        }
    }

    @Override
    public void channelUp() {
        this.device.setChannel(this.device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        this.device.setChannel(this.device.getChannel() -1);
    }

    @Override
    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - 1);
    }
}
