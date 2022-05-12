package Java.Homework.Homework6;

public class Animals {
    protected int price;
    protected int amount;
    protected int grams;
    protected int price1gram;
    protected int takingAcne;


    public Animals(int price, int amount, int grams, int price1gram, int takingAcne) {
        this.amount = amount;
        this.price = price;
        this.grams = grams;
        this.price1gram = price1gram;
        this.takingAcne = takingAcne;

    }

    @Override
    public String toString() {
        return "Animals{" +
                "price=" + price +
                ", amount=" + amount +
                ", grams=" + grams +
                ", price1gram=" + price1gram +
                '}';
    }
    public void PetInfo(){


    }


}
