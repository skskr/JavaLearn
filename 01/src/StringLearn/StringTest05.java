package StringLearn;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串:");
        String line = sc.nextLine();

        String str2 = stringReverse(line);
        System.out.println(str2);

    }

    public static String stringReverse(String str) {
        String s = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }
}
