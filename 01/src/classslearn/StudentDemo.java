package classslearn;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();
        Student s3 = s;
//      System.out.println(s.name+","+s.age);
//禁止直接访问
        System.out.println(s.getName()+","+s.getAge());
        s.study();
        s.doHomeWork();
        s.setAge(210);
        s.setAge(10);
        System.out.println(s3.getAge());
        s.show();
        s2.setName("gugu");
        s2.show();
        s3.setName("llll");
        s3.show();
    }
}
