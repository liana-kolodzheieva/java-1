package Java.Homework;

import java.util.Scanner;

public class homewotk4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //дано
        System.out.println("write 1 ball: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("write 2 ball: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("write 3 ball: ");
        double c = Double.parseDouble(scanner.nextLine());
        double d = 3;
        double f = Math.PI;
        // деля узнавания 3 шаров
        double abc = 4.0/3.0;
        // узнаем 1 шар
        //r3
        double a1 = Math.pow(a, d);
        //Pi*r3
        double a2 = f * a1;
        //последнее действие
        double a3 = abc * a2;

        //узнаем шар 2
        // r3
        double b1 = Math.pow(b, d);
        //Pi*r3
        double b2 = f * b1;
        //последнее действие
        double b3 = abc * b2;

        //узнаем шар 3
        //r3
        double c1 = Math.pow(c, d);
        //Pi*r3
        double c2 = f * c1;
        //последнее действие
        double c3 = abc * c2;

        //результат
        System.out.println("first ball : " + a3);
        System.out.println("second ball : " + b3);
        System.out.println("third ball : " + c3);
    }

}
