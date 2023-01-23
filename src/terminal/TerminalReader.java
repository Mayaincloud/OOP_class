package terminal;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    public static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader (CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    private final static Scanner in = new Scanner (System.in);
    public void getI (int f){
        while (true){
            String command = in.nextLine();
            String[] parseCommand = commandParser.parserCommand(command);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(parseCommand);
            commandExecutable.execute();
        }
    }
}
