package model;

import java.util.Scanner;

public class Person {
    String firstName, lastName, city;
    int birthYear;

    public Person(){}

    public Person(String firstName, String lastName, int birthYear, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.city = city;
    }

    public String info(){
        return ("First Name: " + firstName + ". Last Name: " + lastName + ". Birth Year: " + birthYear + "." + " City: " + city);
    }

    public void newInput(Scanner input) {
        System.out.print("Enter First Name: ");
        this.firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = input.nextLine();
        System.out.print("Enter Birth Year: ");
        this.birthYear = Integer.parseInt(input.nextLine());
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }
}
