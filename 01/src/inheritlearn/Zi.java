package inheritlearn;

import javax.sound.midi.SoundbankResource;

//java只支持单继承，多层继承
public class Zi extends Fu {
    public int age = 20;

    public Zi(){
        //子类构造方法默认第一句是 super(); 写不写都一样，默认访问父类无参构造方法调用，
        // 如果父类没有无参构造方法，就显式地调用父类构造方法
        System.out.println("Zi无参构造方法");
    }

    public Zi(int age){
        this.age = age;
        System.out.println("Zi带参构造方法");
    }

    @Override
    public void method(){
        System.out.println("Zi的method()被调用");
    }

    @Override
    public void show(){
        int age = 50;
        System.out.println(super.age);
        System.out.println(this.age);
        System.out.println(age);
        System.out.println("Fu的show()被调用");
    }

}
