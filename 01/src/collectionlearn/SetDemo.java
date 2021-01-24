package collectionlearn;

import collectionlearn.student.Student;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("uuuu");
        hashSet.add("hello");
        System.out.println(hashSet);

        Student student1 = new Student("学生1", "gauge");
        Student student2 = new Student("学生2", "kudzu");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("---------");
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("---------");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        //重写hashcode方法可以实现不同对象hash值相同

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("uuuu");
        System.out.println(linkedHashSet);

        //hashSet用哈希表实现，乱序
        //linkedset用哈希表和链表链表实现，和输入顺序相同

        System.out.println("---------");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(60);
        treeSet.add(30);
        treeSet.add(3);
        System.out.println(treeSet);
        //自然排序

        treeSet.clear();
        Random random = new Random();
        while (treeSet.size()<10){
            int number = random.nextInt(100);
            treeSet.add(number);
        }
        System.out.println(treeSet);
    }

}
