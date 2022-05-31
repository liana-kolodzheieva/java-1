package Java.Homework.HomeworkLesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandBag {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Input length: ");
        double length = Double.parseDouble(READER.readLine());
        System.out.println("Input width: ");
        double width = Double.parseDouble(READER.readLine());
        System.out.println("Input height: ");
        double height = Double.parseDouble(READER.readLine());
        String massage = isHandBag(length, width, height) ? " It Is Hand Bag" :
                "It Is Not Hand Bag";
        System.out.println(massage);
    }

    public static boolean isHandBag(double length, double width, double height) {
        if (length <= 55 && width <= 20 && height <= 40 || length <= 40 && width <= 22 && height <= 53) {
            return true;
        }
        return false;
    }


}
