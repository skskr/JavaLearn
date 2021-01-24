package polymorphismlearn;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        //向上转型
        cat.eat();
        AnimalOperator ao = new AnimalOperator();
        System.out.println(cat.age);
        //输出是父类的值
//        System.out.println(animal.weight);
        Cat cat2 = new Cat();
        ao.useAnimal(cat);
        ao.useAnimal(cat2);

        Cat cat3 = (Cat)cat;
        //强制类型转换 向下转型
        ao.useAnimal(cat3);


        Dog dog = new Dog();
        ao.useAnimal(dog);
    }
}
//成员变量，编译看左边，执行看左边
//成员方法，编译看左边，执行看右边
//表面上看是左边类的引用类型，内存中指向右边的类型