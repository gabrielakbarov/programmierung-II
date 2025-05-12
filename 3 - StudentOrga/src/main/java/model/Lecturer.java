package model;

public class Lecturer extends Person {
    private String department;

    public Lecturer() {}

    public Lecturer(String firstName, String lastName, int birthYear, String city, String department) {
        super(firstName, lastName, birthYear, city);
        this.department = department;
    }

    public String info(){
        return (super.info() + ". Department: " + this.department + ".");
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
