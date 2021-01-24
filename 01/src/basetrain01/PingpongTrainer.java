package basetrain01;


public class PingpongTrainer extends Trainer implements English{
    public PingpongTrainer() {
    }

    public PingpongTrainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("teach ping-pong");
    }

    @Override
    public void speak() {
        System.out.println("trainer speak english");
    }
}
