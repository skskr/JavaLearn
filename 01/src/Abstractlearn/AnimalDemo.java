package Abstractlearn;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        //抽象类不能实例化，参照多态，通过子类对象实例化，抽象类多态
        a.eat();
        a.sleep();
    }
}
