import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:\t");
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Your name is " + name + ".");
    }
}
