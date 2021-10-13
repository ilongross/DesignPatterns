package com.ilongross.patterns.behavioral.commands.base;

public class HowAreYouCommand extends Command{

    public HowAreYouCommand(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    protected boolean execute() {
        previousState = commandExecutor.getState();
        System.out.println("How are you?");
        commandExecutor.setState("How are you?");
        return true;
    }
}
