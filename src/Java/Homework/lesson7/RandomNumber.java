package Java.Homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumber {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("guess a number from 1-10: ");
        int answer = Integer.parseInt(READER.readLine());
        int random = (int) (Math.random() * 10);
        while (answer != random){
            if (answer < random){
                System.out.println("The number is less than required");
            }else
                System.out.println("The number is greater than required");
            answer = Integer.parseInt(READER.readLine());
        }
        System.out.println("correctly");
    }


}
