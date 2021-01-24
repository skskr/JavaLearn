package exceptionlearn;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try{
            arr[3] = 2;
            //new ArrayIndexOutOfBoundsException(string:message)
            //Throwable 类构造函数初始化 detailMessage
        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组下标越界了");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
            System.out.println(e.toString());
        }
        System.out.println(arr[0]);
    }
}
