package dto;

public class Teacher extends User {
    private String department;

    public Teacher(String firstName, String lastName, int id, String department) {
        super(firstName, lastName, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}