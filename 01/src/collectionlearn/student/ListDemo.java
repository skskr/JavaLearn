package collectionlearn.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student stu = new Student("学生"+i, "小小"+i);
            students.add(stu);
        }
        //迭代器遍历
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.toString());
        }
        //for get遍历
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.toString());
        }
    }
}
