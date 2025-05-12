package application;

import model.Lecturer;

import java.util.Scanner;

public class LecturerApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lecturer lecturer = new Lecturer("Holger", "Parlow", 1970, "Paderborn", "Wirtschaftsinformatik");
        System.out.println(lecturer.info());

        Lecturer lecturer2 = new Lecturer();
        lecturer2.newInput(scanner);
        lecturer2.setDepartment("Datenbanken");
        lecturer2.setCity("Berlin");
        System.out.println(lecturer2.getCity());
        System.out.println(lecturer2.getDepartment());
        System.out.println(lecturer2.info());
    }
}
