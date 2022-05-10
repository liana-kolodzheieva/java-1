package Java.Homework.homework5;

public class Plain {
    protected String name;
    protected String type;

    public Plain(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plain{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    public void printInfo() {
        System.out.println("aircraft type: " + type + ", name: " + name);

    }
}
