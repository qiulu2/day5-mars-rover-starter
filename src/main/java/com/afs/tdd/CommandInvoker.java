package com.afs.tdd;

import com.afs.tdd.command.Command;
import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }

    public void executeCommand(Command command) {
        command.execute();
    }
}
