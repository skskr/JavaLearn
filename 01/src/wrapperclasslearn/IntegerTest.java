package wrapperclasslearn;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "90 84 47 88 46 8 29";
        //把字符串数据split存到数组中
        String[] strings = s.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < arr.length; i++) {
            //字符串转int
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
