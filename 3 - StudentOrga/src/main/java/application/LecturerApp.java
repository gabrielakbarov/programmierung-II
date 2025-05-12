package application;

import model.Lecturer;

public class LecturerApp{
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Holger", "Parlow", 1970, "Paderborn", "Wirtschaftsinformatik");
        System.out.println(lecturer.info());
    }
}
