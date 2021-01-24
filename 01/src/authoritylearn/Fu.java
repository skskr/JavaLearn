package authoritylearn;

public class Fu {
    public void show1(){
        System.out.println("public");
    };
    void show2(){
        System.out.println("default");
    }
    protected void show3(){
        System.out.println("protected");
    }
    private void show4(){
        System.out.println("private");
    }

    public static void main(String[] args) {
        Fu f1 = new Fu();
        f1.show1();
        f1.show2();
        f1.show3();
        f1.show4();
    }
}
