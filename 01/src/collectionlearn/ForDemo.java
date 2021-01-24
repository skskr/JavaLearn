package collectionlearn;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i:arr
             ) {
            System.out.println(i);
        }

        String[] strings = {"111", "222", "333"};
        for (String s:strings
             ) {
            System.out.println(s);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("qqq");
        stringList.add("www");
        stringList.add("eee");
        stringList.add("rrr");
        for (String s:stringList
             ) {
            System.out.println(s);
        }

        for (String s:stringList
        ) {
            if(s.equals("www")){
                stringList.add("111");
                //因为底层实现是迭代器，所以会出现并发修改异常
            }
        }
    }
}
