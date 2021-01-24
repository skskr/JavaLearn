package StringLearn;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String line = sc.nextLine();

        int[] count = new int[3];

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >='A' && line.charAt(i) <= 'Z'){
                count[0]++;
            }
            if (line.charAt(i) >='a' && line.charAt(i) <= 'z'){
                count[1]++;
            }
            if (line.charAt(i) >='0' && line.charAt(i) <= '9'){
                count[2]++;
            }
        }
        System.out.println("大写字母个数："+ count[0] + "小写字母个数："+ count[1] + "数字个数："+ count[2]);
    }
}
