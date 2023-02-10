package terminal;

import java.util.List;
import terminal.Command;

import static java.util.Arrays.asList;


public  class CommandParserImpl implements CommandParser <String> {



    public Command parserCommand(String inputCommand) {
        List<String> list = asList(inputCommand.split(" "));
        return new Command(list);
    }


}
