package Java.Homework.lesson7;

public class Japan {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
          if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9)
              continue;
            System.out.println(i);
        }
    }
}
