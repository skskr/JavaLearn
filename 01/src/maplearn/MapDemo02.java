package maplearn;

import java.util.*;

public class MapDemo02 {
    public static void main(String[] args) {
        HashMap<String, Student> studentHashMap = new HashMap<String, Student>();
        ArrayList<HashMap<String, Student>> arrayList = new ArrayList<HashMap<String, Student>>();
        HashMap<String, ArrayList> stugroup = new HashMap<String, ArrayList>();
        for (int j = 0; j < 4; j++) {
            HashMap<String, Student> studentHashMap1 = new HashMap<String, Student>();
            for (int i = 0; i < 5; i++) {
                String s = "2000" + i;
                Student stu = new Student("2000" + i, "学生" + i, 16 + i);
                studentHashMap.put(s, stu);
            }
            arrayList.add(studentHashMap1);
        }

        for (int i = 0; i < 4; i++) {
            ArrayList<Student> arrayList1 = new ArrayList<Student>();
            for (int j = 0; j < 5; j++) {
                String s = "2000" + j+i;
                Student stu = new Student("2000" + j+i, "学生" + j, 16 + j);
                arrayList1.add(stu);
            }
            stugroup.put("小组"+i, arrayList1);
        }

        System.out.println("arraylist嵌套hashmap");
        for (HashMap<String, Student> students : arrayList
        ) {
            Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
            for (Map.Entry<String, Student> entry : entries
            ) {
                System.out.println(entry.getKey() + " -- " + entry.getValue().toString());
            }
            System.out.println("-----------");
        }

        System.out.println("hashmap签到arraylist");
        Set<Map.Entry<String, ArrayList>> entries = stugroup.entrySet();
        for (Map.Entry<String, ArrayList> entry : entries
        ) {
            System.out.println(entry.getKey());
            ArrayList<Student> students = entry.getValue();
            for(Student s:students){
                System.out.println(s.toString());
            }
            System.out.println("---------");
        }

    }
}
