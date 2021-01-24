package arraylistlearn;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("wang");
        array.add("jia");
        array.add("le");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
