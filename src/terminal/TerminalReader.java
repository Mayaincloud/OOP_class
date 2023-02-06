package terminal;

import terminal.executable.CommandExecutableFactory;



import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory  ){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader (CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory =commandExecutableFactory;
    }


    private final static Scanner in = new Scanner (System.in);
    public void getI (int f){
        while (true){
            String command = in.nextLine();
            Command parseCommand = commandParser.parserCommand(command);
            //CommandExecutable commandExecutable = commandExecutableFactory.create(Command command);
        }
    }
}
