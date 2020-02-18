package ohi.andre.tui.commands;

import java.util.HashMap;

public class CommandSet {
    private static HashMap<String, AbstractCommand> commandSet;

    private static void initialize() {
        commandSet = new HashMap<>();


    }

    public static AbstractCommand get(String commandName) {
        initialize();
        return commandSet.get(commandName);
    }
}
