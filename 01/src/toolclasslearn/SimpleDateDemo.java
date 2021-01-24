package toolclasslearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1 = sdf.format(date1);
        String s2 = sdf2.format(date1);
        System.out.println(s1);
        System.out.println(s2);

        //String ----- date
        String s3 = "2020-12-21 10:20:45";
        Date date2 = sdf2.parse(s3);
        System.out.println(date2);
    }
}
