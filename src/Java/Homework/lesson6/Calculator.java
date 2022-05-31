package Java.Homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Input first number: ");
        double firstNumber = Double.parseDouble(READER.readLine());
        System.out.println("Input operation: ");
        char operation = READER.readLine().charAt(0);
        System.out.println("Input second number: ");
        double secondNumber = Double.parseDouble(READER.readLine());

        if (secondNumber == 0 && operation == '/') {
            System.out.println("!Can't divide by 0!");
            return;
        }
        double result = calculation(firstNumber, operation, secondNumber);
        System.out.println(firstNumber + " " + operation + " "  + secondNumber + " = " + result);
    }

    public static double calculation(double firstNumber, char operation, double secondNumber) {
        double result = 0;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            default -> System.out.println("unknown operation");
        }
        return result;

    }
}