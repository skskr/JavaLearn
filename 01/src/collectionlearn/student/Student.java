package collectionlearn.student;

import java.util.Objects;

public class Student implements Comparable{
    private String sid;
    private String name;

    public Student(){}
    public Student(String sid, String name){
        this.sid = sid;
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name);
    }


    /**
     * 类的自然排序规则，实现Comparable接口
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.sid.compareTo(student.sid)>0){
            return 1;
        } else if (this.sid.compareTo(student.sid)<0){
            return -1;
        } else {
            return 0;
        }
//        return 1;
    }
}
