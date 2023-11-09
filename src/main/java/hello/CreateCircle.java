package hello;

import java.util.Scanner;

public class CreateCircle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] varArgs) {

        Circle circle = new Circle();
        System.out.println("Circle 1 radius: ");
        circle.setRadius(sc.nextInt());
        double area    = circle.getArea();

        Circle circle2 = new Circle();
        System.out.println("Circle 2 radius: ");
        circle2.setRadius(sc.nextInt());
        double area2 = circle2.getArea();


        System.out.println("Circle 1 area: " + area + "   Circle 2 area: " + area2);

        Shape c3 = new Circle(70);
        System.out.println(c3.getArea());

    }
}