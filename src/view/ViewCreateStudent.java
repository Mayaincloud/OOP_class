package view;

import terminal.executable.CommandExecutable;
import terminal.executable.CreateStudentExecutable;

public class ViewCreateStudent implements ReView {

    private final CommandExecutable commandExecutable;

    public ViewCreateStudent(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void review() {
        if (commandExecutable instanceof CreateStudentExecutable) {
            System.out.println("Студент добавлен");
        }
    }

}