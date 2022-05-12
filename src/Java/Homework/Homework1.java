package Java.Homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write first number a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("write second number b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double a2 = a;
        a = b;
        b = a2;

        System.out.println("после обмена");

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
