package Java.Homework.homework5;

public class BusinessPlane extends  Plain{
    public int economy;
    public int business;
    public BusinessPlane(String name, String tripe, int economy, int business) {
        super(name, tripe);
        this.business = this.business;
        this.economy = this.economy;
    }
    @Override

    public void printInfo() {
        System.out.println("aircraft type: " + type + ", name: " + name +  ", economy " + business + ", business " + economy);

    }
}
