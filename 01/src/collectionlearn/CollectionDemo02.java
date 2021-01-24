package collectionlearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello1");
        c.add("hello2");
        c.add("hello3");
        c.add("hello4");
        c.add("hello5");

        //遍历，通过集合对象获得迭代器对象，用迭代器对象的hasNext方法判断是否还有对象，next对象获取下一个元素
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(String.valueOf(iterator.next()));
        }

    }
}
