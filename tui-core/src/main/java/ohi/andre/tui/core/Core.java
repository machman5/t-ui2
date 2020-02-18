package ohi.andre.tui.core;

import ohi.andre.tui.commands.AbstractCommand;
import ohi.andre.tui.commands.CommandSet;

/*
This class serves as a gateway between Termux and t-ui. This is the tui-end of the Bridge.
All the operations done by Core are synchronous. Be careful
 */
public class Core {
    public static Core instance;

    private Core() {}

    public static synchronized Core getInstance() {
        if(instance == null) instance = new Core();
        return instance;
    }

    public boolean tryCommand(String commandName) {
        AbstractCommand command = CommandSet.get(commandName);
        if(command != null) {
            command.exec();
            return true;
        } else {
            return false;
        }
    }
}
