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

    public void executeCommand(String command){
        switch (command) {
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
        }
    }

    public void move() {
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

    public void turnLeft() {
        switch (direction) {
            case "N":
                this.direction = "W";
                break;
            case "W":
                this.direction = "S";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                this.direction = "E";
                break;
            case "E":
                this.direction = "S";
                break;
            case "S":
                this.direction = "W";
                break;
            case "W":
                this.direction = "N";
                break;
        }
    }


}
