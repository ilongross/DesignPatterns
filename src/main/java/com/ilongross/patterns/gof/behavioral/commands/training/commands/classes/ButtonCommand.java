package com.ilongross.patterns.gof.behavioral.commands.training.commands.classes;


import com.ilongross.patterns.gof.behavioral.commands.training.commands.Control;

public interface ButtonCommand extends Control {

    void perform();

}
