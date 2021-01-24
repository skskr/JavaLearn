package basetrain01;

public class BasketballPlayer extends player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("learn basketball");
    }
}
