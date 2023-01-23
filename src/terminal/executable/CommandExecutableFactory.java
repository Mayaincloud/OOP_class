package terminal.executable;

import dto.Student;
import service.StudentService;


public class CommandExecutableFactory {
    private StudentService studentService;
    public CommandExecutable create (String [] input){
        if (input[0].equals("/add")){
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        }
        else {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        }

    }
}
