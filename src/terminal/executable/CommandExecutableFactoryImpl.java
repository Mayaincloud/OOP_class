package terminal.executable;

import dto.Student;
import service.StudentService;
import terminal.Command;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private final StudentService studentService;
    public CommandExecutableFactoryImpl (StudentService studentService) {
        this.studentService = studentService;
    }
    @Override
    public CommandExecutable create (Command input) {
        if (input.isCreateCommand()) {
            return new CreateStudentExecutable(studentService, new Student(input.getFirstArgument()));
        } else if (input.isCDeleteCommand()) {
            return new DeleteStudentExecutable(studentService,new Student(input.getFirstArgument()));
        } else if (input.isDeleteStudentByFirstNameCommand()) {
            return new DeleteStudentByFirstNameExecutable(studentService, input.getFirstArgument());
        } else if (input.isDeleteByGroupNumberAndYearOfBirthCommand()) {
            Integer.parseInt(input.getFirstArgument().split("")[0]);
            return new DeleteStudentByGroupNumberAndYearOfBirthExecutable(studentService,
                    Integer.parseInt(input.getFirstArgument().split("")[0]),
                    Integer.parseInt(input.getFirstArgument().split("")[1]));
        } else
            return null;
    }

}

