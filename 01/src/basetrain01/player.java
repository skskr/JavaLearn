package basetrain01;

public class player extends Person {
    public player() {
    }

    public player(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("player eat");
    }

    public void learn(){
        System.out.println("player learn");
    }
}
