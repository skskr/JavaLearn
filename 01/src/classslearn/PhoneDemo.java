package classslearn;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.sendMessage();
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        System.out.println(p.getClass());
    }
}
