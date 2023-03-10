package terminal.executable;


import service.StudentService;

public class DeleteStudentByFirstNameExecutable implements CommandExecutable {
    private final StudentService studentService;
    private String firstName;

    public DeleteStudentByFirstNameExecutable(StudentService studentService, String firstName) {
        this.firstName = firstName;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByFirstName(firstName);
        System.out.println("Удалить студента по имени: " + firstName);
    }
}