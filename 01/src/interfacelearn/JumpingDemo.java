package interfacelearn;

public class JumpingDemo {
    public static void main(String[] args) {
        Jumping c = new Cat();
//接口不能直接实例化对象，接口多态
        c.jump();

        Animal a1 = new Cat("miaomiao", 8);
        Animal a2 = new Dog("wangwang", 9);
        a1.eat();
//        a1.jump();
        a2.eat();
//        a2.jump();
        Cat cat = new Cat();
        //在实际使用时更多的是用子类对象，因为子类的方法是最多的
        cat.setName("菲菲");
        cat.setAge(3);
        cat.jump();
    }
}
