package basetrain01;

public class BasketballTrainer extends Trainer{
    public BasketballTrainer() {
    }

    public BasketballTrainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("teach basketball");
    }
}
