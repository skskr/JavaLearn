package basetrain01;

public class PingpongPlayer extends player implements English{
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn(){
        System.out.println("learn ping-pong");
    }

    @Override
    public void speak() {
        System.out.println("play speack english");
    }
}
