package inheritlearn;

/**
 * @author wjl
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchRat(){
        System.out.println("抓老鼠");
    }
}
