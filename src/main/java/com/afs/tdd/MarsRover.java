package com.afs.tdd;

import com.afs.tdd.command.Command;
import com.afs.tdd.command.MoveCommand;
import com.afs.tdd.command.TurnLeftCommand;
import com.afs.tdd.command.TurnRightCommand;

public class MarsRover {
    public static final String COMMAND_MOVE = "M";
    public static final String COMMAND_TURN_LEFT = "L";
    public static final String COMMAND_TURN_RIGHT = "R";

    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final String WEST = "W";


    int x;
    int y;
    String direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }


    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void executeCommand(String commandType) {
        Command command;
        switch (commandType) {
            case COMMAND_MOVE:
                command = new MoveCommand(this);
                break;
            case COMMAND_TURN_LEFT:
                command = new TurnLeftCommand(this);
                break;
            case COMMAND_TURN_RIGHT:
                command = new TurnRightCommand(this);
                break;
            default:
                return;
        }
        command.execute();
    }

    public void move() {
        switch (direction) {
            case NORTH:
                y += 1;
                break;
            case SOUTH:
                y -= 1;
                break;
            case EAST:
                x += 1;
                break;
            case WEST:
                x -= 1;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case WEST:
                direction = SOUTH;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case EAST:
                direction = NORTH;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }
}
