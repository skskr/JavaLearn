package innerclasslearn01;

public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner o1= new Outer().new Inner();
        //针对public内部类，但是实际内部类是private
        Outer o2 = new Outer();
        o2.method();

    }
}
