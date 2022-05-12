package Java.Homework.Homework6;

public class Cats extends Animals {


    public Cats(int price, int amount, int grams, int price1gram, int takingAcne) {
        super(price, amount, grams, price1gram, takingAcne);
    }

    @Override
    public void PetInfo() {
        //стоимость Х грамм
        int priceForXGrams = grams * price1gram;
        System.out.println("price per " + grams + " grams: " + priceForXGrams);
        // стоимность пищи за 1 день
        int pricesSpentPerDay = priceForXGrams * takingAcne;
        System.out.println("cost of food for 1 day: " + pricesSpentPerDay);
        //стоимость пищи за месяц
        int pricesSpentPer30Day = pricesSpentPerDay * 30;
        System.out.println("cost of food for 30 day: " + pricesSpentPer30Day);
        //трата на Х котов за 30 дней
        int amountCatsCost = pricesSpentPer30Day * amount;
        System.out.println("cost of food for " + amount + " cats for 30 days " + amountCatsCost);
        //трата на Х котов за 1 днь
        int amountCatsCostFor1Day = pricesSpentPerDay * amount;
        System.out.println("cost of food for " + amount + " cats for 1 day" + amountCatsCostFor1Day);




    }
}
