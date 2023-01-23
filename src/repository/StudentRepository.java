package repository;

import dto.Student;

public class StudentRepository implements UserRepository<Student,Integer>{


    @Override
    public Student save(Student entity) {
        return null;
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

    public Student deleteStudentByFirstName(String firstName) {
        return null;
    }

    public Student deleteStudentByGroupNumberAndeYearOfBirth(int groupNumber, int yearOfBirth) {
        return null;
    }
}
