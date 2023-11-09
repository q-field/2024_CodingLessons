package hello;

import java.util.Scanner;

public class CreateOctagon {

    static Scanner sc      = new Scanner(System.in);
    static Octagon octagon = new Octagon();

    public static void main(String[] varArgs) {

        System.out.println("Octagon side: ");
        double side = sc.nextInt();
        octagon.setSide(side);
        double area = octagon.getArea();


        System.out.println("Circle area: " + area);

    }
}