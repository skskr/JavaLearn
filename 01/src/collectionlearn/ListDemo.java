package collectionlearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
//            if(s.equals("hello")){
//                list.add("3333");
//            }
            //并发修改异常，list中有个成员变量，修改次数 modcount，每次调用next都会对比iterator的预期修改次数，不一致就抛出异常
        }

        list.add(2, "2222");
        System.out.println(list);
//        list.add(7, "5555");
        //不能越界

        list.remove(3);
        System.out.println(list);
        list.set(3, "world333");
        System.out.println(list);
        //避免并发修改异常
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //listIterator可以修改
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String s = listIterator.next();
            if(s.equals("2222")){
                listIterator.add("5555");
            }
        }
        System.out.println(list);

    }
}
