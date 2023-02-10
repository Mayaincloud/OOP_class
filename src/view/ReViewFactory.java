package view;

import terminal.Command;
import terminal.executable.CommandExecutable;


public class ReViewFactory {
    public ReView review(Command command, CommandExecutable commandExecutable) {
        if (command.isCreateCommand()) {
            return new ViewCreateStudent(commandExecutable);
        } else if (command.isDeleteStudentByFirstNameCommand()) {
            return new ViewDeleteStudentByFirstName(commandExecutable);
        }
        else return null;
    }
}
