package com.afs.tdd.command;

import com.afs.tdd.MarsRover;

public class MoveBackwardCommand implements Command {
    private final MarsRover marsRover;

    public MoveBackwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.moveBackward();
    }
}
