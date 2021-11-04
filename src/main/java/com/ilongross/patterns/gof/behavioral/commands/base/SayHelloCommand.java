package com.ilongross.patterns.gof.behavioral.commands.base;

public class SayHelloCommand extends Command{

    public SayHelloCommand(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    protected boolean execute() {
        previousState = commandExecutor.getState(); // for another object use clone();
        System.out.println("Hello!");
        commandExecutor.setState("Hello");
        return true;
    }
}
