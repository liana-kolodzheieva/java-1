package Java.Homework.homework5;

public class PassengerPlain extends Plain {
    public int economy;
    public PassengerPlain(String name, String type, int economy) {
        super(String.valueOf(name), type);
        this.economy = economy;
    }
    @Override
    public void printInfo() {
        System.out.println("aircraft type: " + type + ", name: " + name + ", economy  " + economy);

    }


}
