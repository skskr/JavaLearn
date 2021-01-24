package collectionlearn.student;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        LinkedList<Student> linkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Student stu = new Student("学生"+i, "小小"+i);
            arrayList.add(stu);
            linkedList.add(stu);
        }

        for (Student s:arrayList
             ){
            System.out.println(s.toString());
        }
        for (Student s:linkedList
             ) {
            System.out.println(s.toString());
        }
    }
}
