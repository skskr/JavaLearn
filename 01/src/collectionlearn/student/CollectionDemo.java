package collectionlearn.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> col = new ArrayList<Student>();
        for (int i = 0; i < 5; i++) {
            Student stu = new Student("学生"+i, "小小"+i);
            col.add(stu);
        }

        Iterator<Student> iterator = col.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.toString());
        }
    }
}
