package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoTest {
    // move
    @Test
    void should_return_X1_Y0_W_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "W");

        marsRover.executeCommand("M");

        Assertions.assertEquals(-1, marsRover.getX());
    }

    @Test
    void should_return_X0_Y1_W_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "N");

        marsRover.executeCommand("M");

        Assertions.assertEquals(1, marsRover.getY());
    }

    @Test
    void should_return_X0_Y_1_W_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "S");

        marsRover.executeCommand("M");

        Assertions.assertEquals(-1, marsRover.getY());
    }

    @Test
    void should_return_X1_Y0_E_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "E");

        marsRover.executeCommand("M");

        Assertions.assertEquals(1, marsRover.getX());
    }

    // turn left
    @Test
    void should_return_X0_Y0_S_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "W");

        marsRover.executeCommand("L");

        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_E_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "S");

        marsRover.executeCommand("L");

        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_N_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "E");

        marsRover.executeCommand("L");

        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_W_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "N");

        marsRover.executeCommand("L");

        Assertions.assertEquals("W", marsRover.getDirection());
    }


    // turn right
    @Test
    void should_return_X0_Y0_N_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "W");

        marsRover.executeCommand("R");

        Assertions.assertEquals("N", marsRover.getDirection());
    }


    @Test
    void should_return_X0_Y0_W_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "S");

        marsRover.executeCommand("R");

        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_S_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "E");

        marsRover.executeCommand("R");

        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_E_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0,0,"N");

        marsRover.executeCommand("R");

        Assertions.assertEquals("E",marsRover.getDirection());
    }
}


