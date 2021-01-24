package maplearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入英文字符串:");
        String stringin = sc.nextLine();

        //全部变为小写，不区分大小写
        stringin = stringin.toLowerCase();

        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < stringin.length(); i++) {
            Character c = stringin.charAt(i);

            if (c>='a'&&c<='z'||c>='A'&&c<='Z') {
                if (count.containsKey(c)) {
                    count.replace(c, count.get(c) + 1);
                } else {
                    count.put(c, 1);
                }
            } else {
                continue;
            }
        }

        Set<HashMap.Entry<Character, Integer>> hashMapSet = count.entrySet();
        for(HashMap.Entry<Character, Integer> characterIntegerEntry: hashMapSet){
            System.out.println(characterIntegerEntry.getKey()+" : "+characterIntegerEntry.getValue());
        }
    }
}
