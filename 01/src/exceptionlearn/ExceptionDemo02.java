package exceptionlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method1();
        }catch (ParseException e){
            e.getErrorOffset();
        }
        try {
            method2();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    /**
     * 编译时异常,提醒可能会出错,必须进行处理
     * throw只是交给别人处理，最终还是要处理异常
     * @throws ParseException
     */
    public static void method1() throws ParseException {
        String d = "2020-12-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(d);
        System.out.println(date);
    }


    /**
     * 运行时异常，可以不处理，因为最终要修改代码
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void method2() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[2];
        System.out.println(arr[0]+arr[1]+arr[4]);
    }
}
