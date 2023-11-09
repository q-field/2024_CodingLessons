package hello;

import java.util.Scanner;

public class HelloWithName {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] varArgs) {


        System.out.println("What is your name?");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("Nathan")) {
            System.out.println("KYS");
        }
        else {
            System.out.println("Hello " + name + "!");
        }
        System.out.println();

        System.out.println("What day did the first astronaut land on the moon?");
        String day = scanner.nextLine();
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Correct!");
        }
        else if (day.contains("hoax")) {
            System.out.println("KYS");
        }
        else {
            System.out.println("WRONG!");
        }

    }

}