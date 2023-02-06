package controller;

import dto.Student;
import service.DataService;
import service.StudentService;

public class StudentController implements Controller<Student, Integer> {

    private final DataService<Student> studentService;

    public StudentController(DataService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.createUser(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }
}
