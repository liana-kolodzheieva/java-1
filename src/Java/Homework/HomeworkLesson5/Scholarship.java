package Java.Homework.HomeworkLesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a grade in biology ");
        int biology = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter a grade in math ");
        int math = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter a grade in score ");
        int score = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter a grade in art ");
        int art = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter a grade in Ukrainian ");
        int Ukrainian = Integer.parseInt(bufferedReader.readLine());

        if (!GradesValid(biology, math, score, art, Ukrainian)) {
            return;
        }

        double averageScore = calculateTheAverageScore(biology, math, score, art, Ukrainian);
        System.out.println("Average score: " + averageScore);

        yourScholarship(averageScore);

    }

    private static boolean GradesValid(int biology, int math, int score, int art, int Ukrainian) {
        if (biology < 0 || math < 0 || score < 0 || art < 0 || Ukrainian < 0) {
            System.out.println("!error! non-existent estimates");
            return false;
        } else if (biology > 12 || math > 12 || score > 12 || art > 12 || Ukrainian > 12) {
            System.out.println("!error! non-existent estimates");
            return false;
        }
        return true;
    }


    public static double calculateTheAverageScore(int biology, double math, int score, int art, int Ukrainian) {
        return (biology + math + score + art + Ukrainian) / 5;
    }

    public static void yourScholarship(double calculateAverageScore) {
        if (calculateAverageScore >= 10) {
            System.out.println("Increased scholarship");
        } else if (calculateAverageScore < 10 && calculateAverageScore >= 8) {
            System.out.println("regular scholarship");
        } else if (calculateAverageScore < 8) {
            System.out.println("No scholarship");
        }

    }


}
