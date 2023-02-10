package view;

import terminal.executable.CommandExecutable;
import terminal.executable.DeleteStudentByFirstNameExecutable;

public class ViewDeleteStudentByFirstName implements ReView {

    private final CommandExecutable commandExecutable;

    public ViewDeleteStudentByFirstName(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void review() {
        if (commandExecutable instanceof DeleteStudentByFirstNameExecutable) {
            System.out.println("Студент удален");
        }
    }

}