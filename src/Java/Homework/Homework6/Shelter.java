package Java.Homework.Homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Shelter {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

            List<Animals> animals = new ArrayList<>();
            String actionMasage = "chose action: 1.create 2. exit";
            System.out.println(actionMasage);

            String input = READER.readLine();
            while ("create".equals(input.toLowerCase(Locale.ROOT).trim())) {
                Cats cat = createShater();
                if (cat != null) {
                    animals.add(cat);
                }

                System.out.println(actionMasage);
                input = READER.readLine();
            }

            for (Animals animal: animals) {
                animal.PetInfo();
            }

        }

    private void petInfo() {

    }

    public static Cats createShater() throws IOException {
            System.out.println("input pet: cat, dog");
            String PetType = READER.readLine();
        switch (PetType.toLowerCase(Locale.ROOT).trim()) {
                case "cat":
                    int price = getPrice();
                    int amount = getAmount();
                    int grams = getGrams();
                    int price1gram = getPrice1gram();
                    int takingAcne = getMealsCount();

                    return new Cats(price, amount, grams,price1gram, takingAcne  );

            case "dog":
                int price1 = getPrice();
                int amount1 = getAmount();
                int grams1 = getGrams();
                int price1gram1 = getPrice1gram();
                int takingAcne1 = getMealsCount();

                return new Cats(price1, amount1, grams1,price1gram1, takingAcne1  );


            }
            System.out.println("incorrect plain type " + PetType + " try again");

            return null;
        }

        private static int getPrice() throws IOException {
            System.out.println("input prise food: ");
            return Integer.parseInt(READER.readLine());

        }

        private static int getAmount() throws IOException {
            System.out.println("input amount pet: ");
            return Integer.parseInt(READER.readLine());

        }
    private static int getGrams() throws IOException {
        System.out.println("input grams food: ");
        return Integer.parseInt(READER.readLine());

    }
    private static int getPrice1gram() throws IOException {
        System.out.println("input price for 1 gram: ");
        return Integer.parseInt(READER.readLine());

    }
    private static int getMealsCount() throws IOException {
        System.out.println("input count of meals in 1 day: ");
        return Integer.parseInt(READER.readLine());

    }





    }



