package com.afs.tdd;


public class MarsRover {
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

    public void executeCommand(String command) {
        if (command.equals("M")) {
            switch (direction) {
                case "N":
                    this.y += 1;
                    break;
                case "S":
                    this.y -= 1;
                    break;
                case "E":
                    this.x += 1;
                    break;
                case "W":
                    this.x -= 1;
                    break;
            }
        }
    }





}
