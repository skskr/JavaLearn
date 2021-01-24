package interfacelearn;

//public abstract  class Dog implements Jumpping {
//    //抽象类可以不实现，但子类还是要实现
//}
public class Dog extends Animal implements Jumping {
    public Dog(){}
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void jump() {
        System.out.println("dog jump");
    }
}
