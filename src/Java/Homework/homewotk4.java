package Java.Homework;

import java.util.Scanner;

public class homewotk4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //дано
        System.out.println("write r ball1 1: ");
        double r1 = Double.parseDouble(scanner.nextLine());
        System.out.println("write r ball 2: ");
        double r2 = Double.parseDouble(scanner.nextLine());
        System.out.println("write r ball 3: ");
        double r3 = Double.parseDouble(scanner.nextLine());
        double degree = 3;
        double pi = Math.PI;
        // деля узнавания 3 шаров
        double number = 4.0 / 3.0;
        // узнаем 1 шар
        double masa1 = (double) (number * pi * Math.pow(r1, degree));
        //узнаем шар 2
        Double masa2 = (Double) (number * pi * Math.pow(r2, degree));


        //узнаем шар 3
        Double masa3 = (Double) (number * pi * Math.pow(r3, degree));


        //результат
        System.out.println("first ball : " + masa1);
        System.out.println("second ball : " + masa2);
        System.out.println("third ball : " + masa3);
        double balls = (double) (masa1 + masa2 + masa3);
        System.out.println(masa1 + "+" + masa2 + "+" + masa3 + "=" + balls);
        System.out.println("snowman mass: " + balls);
    }
}


