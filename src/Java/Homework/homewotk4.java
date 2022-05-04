package Java.Homework;

import java.util.Scanner;

public class homewotk4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //дано
        System.out.println("write 1 ball: ");
        double ball1 = Double.parseDouble(scanner.nextLine());
        System.out.println("write 2 ball: ");
        double ball2 = Double.parseDouble(scanner.nextLine());
        System.out.println("write 3 ball: ");
        double ball3 = Double.parseDouble(scanner.nextLine());
        double d = 3;
        double pi = Math.PI;
        // деля узнавания 3 шаров
        double number = 4.0/3.0;
        // узнаем 1 шар
        //r3
        double r3 = Math.pow(ball1, d);
        //Pi*r3
        double pir3 = pi * r3;
        //последнее действие
        double ball = number * pir3;

        //узнаем шар 2
        // r3
        double r = Math.pow(ball2, d);
        //Pi*r3
        double pir = pi * r;
        //последнее действие
        double bal2 = number * pir;

        //узнаем шар 3
        //r3
        double rз = Math.pow(ball3, d);
        //Pi*r3
        double pirз = pi * rз;
        //последнее действие
        double bal3 = number * pirз;

        //результат
        System.out.println("first ball : " + ball);
        System.out.println("second ball : " + ball2);
        System.out.println("third ball : " + bal3);
        double balls = (int) (ball + ball2 + bal3);
        System.out.println(ball + "+" + ball2 + "+" + bal3 + "=" + balls);
        System.out.println("snowman mass: " + balls);
        }
    }


