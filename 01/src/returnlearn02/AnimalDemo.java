package returnlearn02;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        ao.useAnimal(new Cat());
        Animal a1 = new Cat();
        ao.useAnimal(a1);

        Animal a2 = ao.getAnimal();
        ao.useAnimal(a2);
    }
}
