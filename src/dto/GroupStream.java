package dto;

import java.util.Iterator;
import java.util.List;

import dto.iterators.GroupStreamIterator;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> listStudentGroup;

    public GroupStream(List<StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    public List<StudentGroup> getStudentGroup() {
        return listStudentGroup;
    }

    public void setStudentGroup(List<StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(listStudentGroup);
    }

}