package toolclasslearn;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {12, 5, 29, 8, 5, 9, 39, 18, 10,45,6,30};
        System.out.println("排序前:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));
    }
}
