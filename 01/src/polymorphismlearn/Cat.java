package polymorphismlearn;

public class Cat extends Animal {
    public int age = 20;
    public int weight;
    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    public void playGame(){
        System.out.println("cat play");
    }
}
