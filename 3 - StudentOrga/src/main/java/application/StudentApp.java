package application;

import model.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Nick", "Schwabenland", 2006, "Paderborn", "Angewandte Informatik");
        System.out.println(student.info());

        Student student2 = new Student();
        student2.setSubject("Business English");
        System.out.println(student2.getSubject());
        System.out.println(student2.info());
    }
}
