package returnlearn03;

public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();
        jo.useJumpping(new Cat());
        Jumping j1 = new Cat();
        jo.useJumpping(j1);

        Jumping j2 = jo.getJumpping();
        jo.useJumpping(j2);
    }
}
