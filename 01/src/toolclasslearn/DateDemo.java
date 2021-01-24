package toolclasslearn;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        System.out.println(date1);
        long date = 1000*60*60;
        Date date2 = new Date(date);
        System.out.println(date2);

        System.out.println(date1.getTime());
        //获取从基准时间到现在的毫秒值
        long time = System.currentTimeMillis();
        date2.setTime(time);
        System.out.println(date2);

        String s1 = DateUtils.dateToString(date1, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(date1, "yyyy-MM-dd");
        System.out.println(s2);
        String s3 = DateUtils.dateToString(date1, "HH-mm-ss");
        System.out.println(s3);
        Date date3 = DateUtils.stringToDate("2020年1月23日 14:42:22", "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(date3);
    }
}
