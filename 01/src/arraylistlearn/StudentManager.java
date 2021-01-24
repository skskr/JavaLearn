package arraylistlearn;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        while(true){
            System.out.println("-------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("输入命令：");
            String line = sc.nextLine();
            switch (line){
                case "1":
                    addStudent(arrayList);
                    break;
                case "2":
                    deleteStudent(arrayList);
                    break;
                case "3":
                    updateStudent(arrayList);
                    break;
                case "4":
                    findAllStudent(arrayList);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }


    }

    public static void addStudent(ArrayList<Student> array) {
        System.out.println("添加一个新学生:");
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String number;
        while (true){
            System.out.println("输入学号;");
            number = sc.nextLine();

            boolean flag = isUsed(array, number);
            if (flag){
                System.out.println("学号已被占用,重新输入");
            } else {
                break;
            }
        }
        System.out.println("输入姓名;");
        String name = sc.nextLine();
        System.out.println("输入年龄");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("输入居住地;");
        String settlement = sc.nextLine();
        s.setNumber(number);
        s.setName(name);
        s.setAge(age);
        s.setSettlement(settlement);
        array.add(s);
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size()>0){
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getNumber()+"\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getSettlement());
            }
        } else {
            System.out.println("无学生信息！");
        }

    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要删除的学生的学号:");
        String number = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getNumber().equals(number)){
                index = i;
                break;
            }
        }
        if (index==-1) {
            System.out.println("无此学生信息！");
        } else {
            array.remove(index);
            System.out.println("删除成功！");
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要修改的学生的学号:");
        String number = sc.nextLine();
        System.out.println("输入新姓名;");
        String name = sc.nextLine();
        System.out.println("输入新年龄");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("输入新居住地;");
        String settlement = sc.nextLine();
        Student s  = new Student();
        s.setNumber(number);
        s.setName(name);
        s.setAge(age);
        s.setSettlement(settlement);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getNumber().equals(number)){
                array.set(i, s);
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("无此学生信息！");
    }

    public static boolean isUsed(ArrayList<Student> array, String sid){
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getNumber().equals(sid)){
                flag = true;
            }
        }
        return flag;
    }

}
