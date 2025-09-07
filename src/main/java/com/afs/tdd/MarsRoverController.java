package com.afs.tdd;

import com.afs.tdd.command.Command;
import com.afs.tdd.command.MoveBackwardCommand;
import com.afs.tdd.command.MoveCommand;
import com.afs.tdd.command.TurnLeftCommand;
import com.afs.tdd.command.TurnRightCommand;

public class MarsRoverController {
    public static final String COMMAND_MOVE = "M";
    public static final String COMMAND_TURN_LEFT = "L";
    public static final String COMMAND_TURN_RIGHT = "R";
    public static final String COMMAND_MOVE_BACKWARD = "B";

    private final MarsRover marsRover;
    private final CommandInvoker invoker;

    public MarsRoverController(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.invoker = new CommandInvoker();
    }

    public void executeCommand(String commandType) {
        Command command = createCommand(commandType);
        if (command != null) {
            invoker.executeCommand(command);
        }
    }

    public void executeCommands(String commandsString) {
        for (char commandChar : commandsString.toCharArray()) {
            Command command = createCommand(String.valueOf(commandChar));
            if (command != null) {
                invoker.addCommand(command);
            }
        }
        invoker.executeCommands();
    }

    private Command createCommand(String commandType) {
        switch (commandType) {
            case COMMAND_MOVE:
                return new MoveCommand(marsRover);
            case COMMAND_TURN_LEFT:
                return new TurnLeftCommand(marsRover);
            case COMMAND_TURN_RIGHT:
                return new TurnRightCommand(marsRover);
            case COMMAND_MOVE_BACKWARD:
                return new MoveBackwardCommand(marsRover);
            default:
                return null;
        }
    }
}
