package toolclasslearn;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份：");
        int year = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, 2, 1);

        cal.add(Calendar.DATE, -1);

        int date = cal.get(Calendar.DATE);
        System.out.println(year+"年的二月有"+date+"天");
    }
}
