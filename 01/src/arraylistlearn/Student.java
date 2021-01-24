package arraylistlearn;

public class Student {
    private String number;
    private String name;
    private int age;
    private String settlement;

    public Student() {
    }

    public Student(String number, String name, int age, String settlement) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.settlement = settlement;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("超出范围，请检查");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }
}
