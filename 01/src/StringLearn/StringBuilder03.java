package StringLearn;

import java.util.Scanner;

public class StringBuilder03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个字符串:");
        String str = sc.nextLine();

        String str2 = stringReverse(str);

        System.out.println(str2);
    }

    public static String stringReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

}
