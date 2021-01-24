package inheritlearn;

public class Fu {
    public int age = 40;

    public Fu(){
        System.out.println("Fu无参构造方法");
    }

    public Fu(int age){
        this.age = age;
        System.out.println("Fu带参构造方法调用");
    }

    public void method(){
        System.out.println("Fu的method()被调用");
    }

    public void show(){
        System.out.println(this.age);
        System.out.println("Fu的show()被调用");
    }

    private void donot(){}
    //私有方法不能被子类重写

}
