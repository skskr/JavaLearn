package interfacelearn;

public abstract class Animal{
    protected String name;
    protected int age;

    public Animal(){}
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
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
        this.age = age;
    }

    public abstract  void eat();
}
//抽象类可以不实现接口，但子类还是要实现