package collectionlearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        //操作相同
        arrayList.add("hello1");
        arrayList.add("hello2");
        arrayList.add("hello3");


        for (String s:arrayList
             ) {
            System.out.println(s);
        }

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
