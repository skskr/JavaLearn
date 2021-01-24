package basetrain01;

public class Trainer extends Person{
    public Trainer() {
    }

    public Trainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("trainer eat");
    }

    public void teach(){
        System.out.println("trainer teach");
    }
}
