package application;

import model.Person;
import model.Student;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Connor", "Schweigi", 2005, "Paderborn");
        System.out.println(person.info());

    }
}
