package hello;

import java.util.Scanner;

public class Receipt {

    static Scanner      scanner  = new Scanner(System.in);
    static final double TAX_RATE = .13;

    public static void main(String[] args) {

        System.out.println("Please enter the cost:");
        double cost = scanner.nextDouble();
        System.out.println("Taxes: " + (cost * TAX_RATE));
    }
}
