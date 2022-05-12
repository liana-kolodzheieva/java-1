package Java.Homework.Homework6;

public class Dogs extends Animals {
    public Dogs(int price, int amount, int grams, int price1gram, int takingAcne) {
        super(price, amount, grams, price1gram, takingAcne);
    }
    @Override
    public void PetInfo() {
        //стоимость Х грамм
        int priceForXGramsDog = grams * price1gram;
        System.out.println("price per " + grams + " grams: " + priceForXGramsDog);
        // стоимность пищи за 1 день
        int pricesSpentPerDayDog = priceForXGramsDog * takingAcne;
        System.out.println("cost of food for 1 day: " + pricesSpentPerDayDog);
        //стоимость пищи за месяц
        int pricesSpentPer30DayDog = pricesSpentPerDayDog * 30;
        System.out.println("cost of food for 30 day: " + pricesSpentPer30DayDog);
        //трата на Х собак за 30 дней
        int amountDogsCost = pricesSpentPer30DayDog * amount;
        System.out.println("cost of food for " + amount + " cats for 30 days " + amountDogsCost);
        //трата на Х собак за 1 днь
        int amountDogsCostFor1Day = pricesSpentPerDayDog * amount;
        System.out.println("cost of food for " + amount + " cats for 1 day" + amountDogsCostFor1Day);




    }
}
