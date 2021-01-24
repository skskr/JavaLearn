package inheritlearn;

public class Persondemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("t1name");
        t1.setAge(26);

        Teacher t2 = new Teacher("t2name", 23);

        t1.talk();
        t2.talk();

    }
}
