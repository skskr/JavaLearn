package inheritlearn;

public class Student extends Person{
    public Student(){}
    public Student(String name, int age){
        super(name, age);
    }
    @Override
    public void talk(){
        System.out.println("这是学生");
        super.talk();
    }
}
