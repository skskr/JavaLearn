package innerclasslearn02;

public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();
        jo.method(new Cat());
        Jumping j1 = new Cat();
        jo.method(j1);
        Jumping j2 = new Dog();
        jo.method(j2);
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("rat jump");
            }
        });
    }
}
