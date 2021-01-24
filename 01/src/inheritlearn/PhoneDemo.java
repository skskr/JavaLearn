package inheritlearn;

public class PhoneDemo {
    public static void main(String[] args) {
        String name = "numu";
        Phone p1 = new Phone();
        NewPhone p2 = new NewPhone();
        p1.call(name);
        p2.call(name);
    }
}
