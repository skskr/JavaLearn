package classslearn;

public class Student {
    private String name;
    private int age;

    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("好好学习");
    }

    public void doHomeWork(){
        System.out.println("键盘敲烂，月薪过万");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>120){
            System.out.println("年龄有误");
        }
        else{
            this.age = age;
        }
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
