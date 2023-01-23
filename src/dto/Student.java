package dto;

public class Student extends User implements Comparable<Student> {
    private String department;
    private int course;
    private int yearOfBirth;

    public Student(String firstName){
        super(firstName);
    }


    public Student(String firstName, String lastName, int id, String department, int course, int yearOfBirth) {
        super(firstName, lastName, id);
        this.course = course;
        this.department = department;
        this.yearOfBirth = yearOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.yearOfBirth, o.yearOfBirth);
    }
}