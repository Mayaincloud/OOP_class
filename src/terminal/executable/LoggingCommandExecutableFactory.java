package terminal.executable;

import service.StudentService;
import terminal.Command;


public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LoggingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable commandExecutable= super.create(input);
        System.out.println("что-нибудь");
        return commandExecutable;

    }

}
