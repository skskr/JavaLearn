package collectionlearn.student;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        Student s1 = new Student("学生1", "天天");
        Student s4 = new Student("学生1", "天天");
        Student s2 = new Student("学生2", "天2");
        Student s3 = new Student("学生3", "天3");

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

        for (Student s:hashSet
             ) {
            System.out.println(s.toString());
        };
    }
}
