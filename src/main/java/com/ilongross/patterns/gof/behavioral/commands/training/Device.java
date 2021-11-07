package com.ilongross.patterns.gof.behavioral.commands.training;

import com.ilongross.patterns.gof.behavioral.commands.training.commands.Control;

public interface Device{

    void on(Control command);
    void off(Control command);
    void channelUp(Control command);
    void channelDown(Control command);
    void volumeUp(Control command);
    void volumeDown(Control command);

}
