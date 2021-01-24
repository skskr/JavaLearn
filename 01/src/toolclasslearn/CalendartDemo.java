package toolclasslearn;

import java.util.Calendar;

public class CalendartDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //多态，calendar是个抽象类，返回的是抽象类子类的对象
        System.out.println(calendar);

        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.MONTH, -3);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
    }
}
