package com.ilongross.patterns.behavioral.commands.base;

public abstract class Command {

    protected CommandExecutor commandExecutor;
    protected String previousState;


    public Command(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    protected abstract boolean execute();

    public void undo() {
        commandExecutor.setState(previousState);
    }

}
