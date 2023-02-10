package terminal;

import terminal.Command;

public interface CommandParser <E> {
    Command parserCommand(E inputCommand);

}


