package innerclasslearn01;

public class Outer {
    public void method(){
        Inner inner = new Inner();
        inner.show();
        Inner2 inner2 = new Inner2();
        inner2.show();

        class Inner3{
            public void show(){
                System.out.println(num);
                System.out.println("partial inner");
            }
        }

        Inner3 inner3 = new Inner3();
        inner3.show();
        new Inner4() {
            @Override
            public void show(){
                System.out.println(num);
                System.out.println("anonymous inner");
            }
        };

        new Inner4() {
            @Override
            public void show(){
                System.out.println(num);
                System.out.println("anonymous inner");
            }
        }.show();

        Inner4 inner4 = new Inner4() {
            @Override
            public void show(){
                System.out.println(num);
                System.out.println("anonymous inner");
            }
        };
        inner4.show();
    }

    private int num = 10;
    public class Inner{
        void show(){
            System.out.println(num);
            System.out.println("normal inner");
            //内部类可以直接访问外部类成员和方法
            //而外部类访问内部类需要通过内部类对象
        }
    }
    private class Inner2{
        void show(){
            System.out.println(num);
            System.out.println("private inner");
        }
    }
}

//内部类通过方法和对象简介调用，用户不需要知道内部类怎么调用的
//成员内部类
//局部内部类