package wrapperclasslearn;

/**
 * @author wjl
 */
public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//        Integer i1 = new Integer(100);
        Integer i2 = 100;
        //自动装箱
        Integer i3 = Integer.valueOf("100");
        //装箱，基本类型转包装类类型
//        Integer i4 = Integer.valueOf("a");
        //直接报错
        Integer i5 = (int) 33.2;
//        Integer i6 = Integer.valueOf("33.2");
        int a = i2;
        //自动拆箱
        int b = i2.intValue();
        //拆箱，包装类类型转基本类型


        //String ---- int
        String s1 = "100";
        //方式1
        Integer integer1 = Integer.valueOf(s1);
        int int1 = integer1.intValue();
        //方式2
        int int2 = Integer.parseInt(s1);


    }
}
//包装类常用操作用于基本数据类型和字符串之间的转换
//对对象进行操作前常规操作判null