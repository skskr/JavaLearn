package arraylistlearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist03 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

//        Student s1 = new Student("kuku", 19);
//        Student s2 = new Student("gugu", 20);
//        Student s3 = new Student("tutu", 23);

//        arrayList.add(s1);
//        arrayList.add(s2);
//        arrayList.add(s3);

        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println("姓名:"+s.getName()+", 年龄："+s.getAge());
        }
        addStudent(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println("姓名:"+s.getName()+", 年龄："+s.getAge());
        }

    }

    public static void addStudent(ArrayList<Student> array){
//        System.out.println("添加一个新学生:");
//        Student s = new Student();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入姓名;");
//        String name = sc.nextLine();
//        System.out.println("输入年龄");
//        int age = sc.nextInt();
//        s.setName(name);
//        s.setAge(age);
//        array.add(s);
    }
}
