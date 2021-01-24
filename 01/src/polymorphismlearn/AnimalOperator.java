package polymorphismlearn;

public class AnimalOperator {
//    public void useAnimal(Cat c){
//        c.eat();
//    }
//
//    public void useAnimal(Dog d){
//        d.eat();
//    }

    public void useAnimal(Animal a){
        a.eat();
//        a.playGame();
    }
}

//多态提高了扩展性，使用父类名定义可以访问各自的重写方法
//缺点是不能访问子类独有的方法