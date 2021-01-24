package StringLearn;

public class StringBuilder02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String str = arrayToString(arr);
        System.out.println(str);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
            } else {
                sb.append(arr[i]).append("}");
            }
        }

        String s = sb.toString();
        return s;
    }
}
