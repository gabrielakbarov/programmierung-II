package application;

import model.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Nick", "Schwabenland", 2006, "Paderborn", "Angewandte Informatik");
        System.out.println(student.info());
    }
}
