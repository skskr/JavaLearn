package collectionlearn;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        System.out.println(c.add("hello1"));
        System.out.println(c.add("hello2"));
        System.out.println(c.add("hello3"));
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(c.remove(2));
        System.out.println(c);
        System.out.println(c.contains("hello"));
        System.out.println(c.contains("hello1"));
        c.clear();
        System.out.println(c.isEmpty());
    }
}
