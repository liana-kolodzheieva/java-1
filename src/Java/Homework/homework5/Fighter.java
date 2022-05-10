package Java.Homework.homework5;

public class Fighter extends Plain{
    public Fighter(String name, String type, int economy, int business) {
        super(name, type);
    }

    public Fighter(String name1, String type1) {
        super(name1, type1);
    }
    public void printInfo() {
        System.out.println("aircraft type: " + type + ", name: " + name);

    }
}
