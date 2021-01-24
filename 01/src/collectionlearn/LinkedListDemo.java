package collectionlearn;

import javax.sound.midi.SoundbankResource;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello1");
        linkedList.add("hello2");
        linkedList.add("hello3");
        linkedList.add("hello4");
        linkedList.addFirst("000000");
        linkedList.addLast("11111");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
