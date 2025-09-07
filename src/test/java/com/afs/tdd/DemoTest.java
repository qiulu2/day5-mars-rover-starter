package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoTest {
    // move
    @Test
    void should_return_X1_Y0_W_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("M");

        Assertions.assertEquals(-1, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y1_N_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("M");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(1, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y_1_S_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("M");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(-1, marsRover.getY());
        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_X1_Y0_E_when_execute_command_M() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("M");

        Assertions.assertEquals(1, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    // turn left
    @Test
    void should_return_X0_Y0_S_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("L");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_E_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("L");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_N_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("L");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_W_when_execute_command_L() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("L");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }


    // turn right
    @Test
    void should_return_X0_Y0_N_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("R");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }


    @Test
    void should_return_X0_Y0_W_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("R");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_S_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("R");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_X0_Y0_E_when_execute_command_R() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommand("R");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    // Batch commands tests
    @Test
    void should_execute_multiple_commands_MMLM() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommands("MMLM");

        Assertions.assertEquals(-1, marsRover.getX());
        Assertions.assertEquals(2, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_execute_multiple_commands_MRMLMM() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommands("MRMLMM");

        Assertions.assertEquals(3, marsRover.getX());
        Assertions.assertEquals(-1, marsRover.getY());
        Assertions.assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_execute_multiple_commands_with_full_circle_RRRRLLLL() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommands("RRRRLLLL");

        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(0, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_execute_complex_movement_pattern_MLMRMLMM() {
        MarsRover marsRover = new MarsRover(1, 2, "N");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommands("MLMRMLMM");

        Assertions.assertEquals(-2, marsRover.getX());
        Assertions.assertEquals(4, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_handle_empty_command_string() {
        MarsRover marsRover = new MarsRover(5, 5, "W");
        MarsRoverController controller = new MarsRoverController(marsRover);

        controller.executeCommands("");

        Assertions.assertEquals(5, marsRover.getX());
        Assertions.assertEquals(5, marsRover.getY());
        Assertions.assertEquals("W", marsRover.getDirection());
    }
}
