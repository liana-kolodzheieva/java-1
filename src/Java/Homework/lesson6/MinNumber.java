package Java.Homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNumber {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Input firstNumber: ");
        double firstNumber = Double.parseDouble(READER.readLine());
        System.out.println("Input secondNumber: ");
        double secondNumber = Double.parseDouble(READER.readLine());
        System.out.println("Input thirdNumber: ");
        double thirdNumber = Double.parseDouble(READER.readLine());
        System.out.println("Min number: " + findMinNumber(firstNumber, secondNumber, thirdNumber));
    }
    public static double findMinNumber(double firstNumber, double secondNumber, double thirdNumber){
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        }else {
            return thirdNumber;
        }

    }
}
