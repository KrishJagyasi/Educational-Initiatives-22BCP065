package com.example.marsrover.command;

import com.example.marsrover.model.Rover;

public class TurnLeftCommand implements Command {
    private final Rover rover;

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}