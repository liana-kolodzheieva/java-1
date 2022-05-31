package Java.Homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Input number of apples: ");
        int apples = Integer.parseInt(READER.readLine());
        int applesInBigBank = 5;
        int applesInAverageBank = 3;
        int bigBank = apples / applesInBigBank;
        int inBigBank = bigBank * applesInBigBank;
        int rest = apples - inBigBank;
        int averageBank = rest / applesInAverageBank;
        int inAverageBank = averageBank * applesInAverageBank;
        int rest2 = rest - inAverageBank;
        System.out.println("Big bank: " + bigBank);
        System.out.println("Average bank: " + averageBank);
        System.out.println("Small bank: " + rest2);

    }
}
