package inheritlearn;


public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("tom");
        cat.setAge(10);
        cat.show();
        cat.catchRat();
        Dog dog = new Dog("kafu", 30);
        dog.show();
        dog.watchDoor();
    }
}
