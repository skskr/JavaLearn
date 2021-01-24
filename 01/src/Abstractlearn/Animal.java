package Abstractlearn;

public abstract class Animal {
    public abstract void eat();

    public void sleep(){
        System.out.println("sleep");
    }
}
//抽象类可以又非抽象方法
//一个类有抽象方法必须是抽象类