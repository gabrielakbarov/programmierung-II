package model;

public class Student extends Person {
    private String subject;

    public Student() {}

    public Student(String firstName, String lastName, int birthYear, String city, String subject) {
        super(firstName, lastName, birthYear, city);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String info(){
        return(super.info() + ". Subject: " + this.subject);
    }
}
