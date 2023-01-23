package dto;

import java.util.Iterator;
import java.util.List;

import dto.iterators.StudentGroupIterator;

public class StudentGroup implements Iterable<Student> {
    private Teacher teacher;
    private List<Student> students;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
    public StudentGroup(Teacher teacher, List<Student> studentList, int groupNumber) {
        this(teacher, studentList);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}