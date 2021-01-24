package argslearn;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,6,5,4,8,9,6,5,3,2,4,2,5,3,5));
        //生成可变列表
        List<String> list = Arrays.asList("hello1","hello2","hello3","hello4");
        System.out.println(list);
        list.add("hello5");

        //生成不可变列表
        List<String> list1 = List.of("hello1","hello2","hello3","hello4");
        System.out.println(list1);
//        list1.add("222");
// UnsupportedOperationException

        Set<String> set = Set.of("hello1","hello2","hello3","hello4");
        System.out.println(set);
//        set.remove(1);
        //UnsupportedOperationException
    }

    public static int sum(int... a){
        //可变参数其实是一个数组
        //如果有多个参数，可变参数放末尾和默认参数类似
        int sum = 0;
        for (int i:a
             ) {
            sum += i;
        }
        return sum;
    }

}

