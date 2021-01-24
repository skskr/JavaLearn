package genericslearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello1");
        c.add("hello2");
        c.add("hello3");
        c.add("hello4");

        Iterator it = c.iterator();
        while(it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }

        Generic<String> generic = new Generic<String>();
        generic.setT("generic");
        System.out.println(generic.getT());
        generic.show(100);
        generic.show("1aa");
        generic.show(12.33);

        Generic<Student> generic1 = new Generic<Student>();
        generic1.setT(new Student("200012", "mingzi", 19));
        System.out.println(generic1.getT().toString());

        Generic<Teacher> generic2 = new Generic<Teacher>();
        generic2.setT(new Teacher("100012", "mingzi", 19));
        System.out.println(generic2.getT().toString());

        //类型通配符
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        //类型通配符上限
//        List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Integer>();
        List<? extends Number> list6 = new ArrayList<Short>();

        //类型通配符下限
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
//        List<? super Number> list9 = new ArrayList<Integer>();

    }

}
