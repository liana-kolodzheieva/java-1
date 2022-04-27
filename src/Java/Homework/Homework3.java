package Java.Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //основные числа
        System.out.println("write number a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("write number b: ");
        double b = Double.parseDouble(scanner.nextLine());
        // степень
        int i = 3;
        //квадратный корень
        System.out.println("write Square root: ");
        double c = Double.parseDouble(scanner.nextLine());

        System.out.print("|" + a + "-" + b + "|" + ":" + "(" + a + "+" + b + ")" + "^" + i + "-" + "√" + c + "=");

        //основное число 1 + основное число 2
        double ab = a - b;
        //степени
        double a1 = (Math.pow(a + b, i));

        //модуль
        double ab1 = (Math.abs(ab));
        //модуль/степень
        double a1b2 = ab1 / a1;
        //квадратный корень
        double abab = Math.sqrt(c);
        //модуль/степень-квадратный корень
        double a2b2 = a1b2 - abab;
        //решение
        System.out.println(a2b2);


    }
}
