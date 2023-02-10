package terminal.executable;

import dto.Student;
import service.DataService;


public class CreateStudentExecutable implements CommandExecutable {

    private final DataService<Student> studentService;
    private final Student student;


    public CreateStudentExecutable(DataService<Student> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute(){
        studentService.createUser(student);
    }
}
