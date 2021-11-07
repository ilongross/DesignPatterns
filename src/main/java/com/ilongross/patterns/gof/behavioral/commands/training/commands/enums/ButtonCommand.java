package com.ilongross.patterns.gof.behavioral.commands.training.commands.enums;


import com.ilongross.patterns.gof.behavioral.commands.training.commands.Control;

public enum ButtonCommand implements Control {

    ON,
    OFF,
    CHANNEL_UP,
    CHANNEL_DOWN,
    VOLUME_UP,
    VOLUME_DOWN

}
