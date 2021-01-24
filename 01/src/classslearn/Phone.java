package classslearn;

public class Phone {
    String brand;
    int price;

    public void call(){
        System.out.println("call");
    }

    public void sendMessage(){
        System.out.println("message");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
