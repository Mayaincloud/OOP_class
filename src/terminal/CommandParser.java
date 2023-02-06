package terminal;


public interface CommandParser <E>{
    Command parserCommand (E inputCommand);

}
