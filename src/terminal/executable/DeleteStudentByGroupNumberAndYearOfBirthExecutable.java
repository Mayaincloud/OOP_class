package terminal.executable;

import service.StudentService;

public class DeleteStudentByGroupNumberAndYearOfBirthExecutable implements CommandExecutable {
    private final StudentService studentService;
    private final int groupNumber;
    private final int yearOfBirth;

    public DeleteStudentByGroupNumberAndYearOfBirthExecutable(StudentService studentService, int groupNumber, int yearOfBirth) {
        this.groupNumber = groupNumber;
        this.yearOfBirth = yearOfBirth;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByGroupNumberAndYearOfBirth(groupNumber, yearOfBirth);
        System.out.println("Удаление студента по номеру группы " + groupNumber + " и году рождения " + yearOfBirth);
    }

}
