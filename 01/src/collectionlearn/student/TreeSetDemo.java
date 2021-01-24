package collectionlearn.student;

import java.lang.module.ResolutionException;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student s1 = new Student("1564165", "jfeuo");
        Student s2 = new Student("1545365", "woijro");
        Student s3 = new Student("1548463", "jmlksno");
        Student s4 = new Student("1548833", "fiojenif");

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (Student s:treeSet
             ) {
            System.out.println(s.toString());
        }

        TreeSet<Student> treeSet1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getSid().compareTo(o2.getSid())>0){
                    return 1;
                } else if (o1.getSid().compareTo(o2.getSid())<0){
                    return -1;
                } else {
                    return 0;
                }
//        return 1;
            }
        });
        treeSet1.add(s4);
        treeSet1.add(s3);
        treeSet1.add(s2);
        treeSet1.add(s1);
        for (Student s:treeSet1
        ) {
            System.out.println(s.toString());
        }
    }
}
