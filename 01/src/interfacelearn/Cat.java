package interfacelearn;

public class Cat extends Animal implements Jumping {

    public Cat(){}

    public Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void jump() {
        System.out.println("cat jump");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
