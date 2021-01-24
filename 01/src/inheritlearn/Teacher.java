package inheritlearn;

public class Teacher extends Person {
    public Teacher(){

    }

    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public void talk(){
        System.out.println("这是老师");
        super.talk();
    }
}
