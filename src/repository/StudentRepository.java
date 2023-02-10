package repository;

import dto.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student,Integer>{
    private StudentTable studentTable;

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }

    @Override
    public Student save(Student entity) {
        return studentTable.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String LastName) {
        return null;
    }

    public Student deleteStudent(Student student) {
        return null;
    }

    public boolean deleteStudentByFirstName(String firstName) {
       return studentTable.deleteStudentByFirstName(firstName);
    }

    public Student deleteStudentByGroupNumberAndeYearOfBirth(int groupNumber, int yearOfBirth) {
        return null;
    }
}
