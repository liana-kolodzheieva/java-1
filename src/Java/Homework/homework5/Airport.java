package Java.Homework.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Airport {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<Plain> plains = new ArrayList<>();
        String actionMasage = "chose action: 1.create 2. exit";
        System.out.println(actionMasage);

        String input = READER.readLine();
        while ("create".equals(input.toLowerCase(Locale.ROOT).trim())) {
            Plain plain = createPLain();
            if (plain != null) {
                plains.add(plain);
            }

            System.out.println(actionMasage);
            input = READER.readLine();
        }

        for (Plain plain: plains) {
            plain.printInfo();
        }

    }

    public static Plain createPLain() throws IOException {
        System.out.println("input Plane: business, fighter, passenger");
        String PlainType = READER.readLine();
        switch (PlainType.toLowerCase(Locale.ROOT).trim()) {
            case "business":
                String name = String.valueOf(getName());
                String type = String.valueOf(getType());
                int economy = Integer.parseInt(getEconomy());
                int business = Integer.parseInt(getBusiness());
                return new BusinessPlane(name, type, economy, business );

            case "fighter":
                String  name1 = getName();
                String type1 = getType();
                return new Fighter(name1, type1);

            case "passenger":
                String name2 = getName();
                String type2 = getType();
                int economy1 = Integer.parseInt(getEconomy());
                return new PassengerPlain(name2,type2,economy1);
        }
        System.out.println("incorrect plain type " + PlainType + " try again");

        return null;
    }

    private static String getName() throws IOException {
        System.out.println("input name");
        return READER.readLine();

    }

    private static String  getType() throws IOException {
        System.out.println("input type");
        return READER.readLine();
    }

    private static String getEconomy() throws IOException {
        System.out.println("input economy");
        return READER.readLine();

    }

    private static String getBusiness() throws IOException {
        System.out.println("input business");
        return READER.readLine();

    }
}








