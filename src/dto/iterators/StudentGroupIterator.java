package dto.iterators;

import java.util.Iterator;
import java.util.List;

import dto.Student;
import dto.StudentGroup;

public class StudentGroupIterator implements Iterator<Student> {
    private final StudentGroup studentGroup;

    private final List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudents();

    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();

    }

    @Override
    public Student next() {
        return students.get(cursor++);

    }

    @Override
    public void remove() {
        this.students.remove(cursor);

    }
}