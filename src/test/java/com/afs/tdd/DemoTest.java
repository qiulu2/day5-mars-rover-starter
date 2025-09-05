package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoTest {
    @Test
    void should_return_X1_Y0_E_when_execute_command_M() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0,0,"N");
        marsRover.executeCommand(command);

        Assertions.assertEquals(-1,marsRover.getX());
    }


}


