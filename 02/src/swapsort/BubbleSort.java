package swapsort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 5, 29, 8, 5, 9, 39, 18, 10,45,6,30};
        System.out.println("排序前：" + arrayToString(arr));
        bubbleSort(arr);
        System.out.println("排序后：" + arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i]);
                sb.append(",");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("}");
        String s = sb.toString();
        return s;
    }

    public static void bubbleSort(int[] arr) {
        int temp;
//        //升序，向后冒泡
//        //排序趟数
//        for (int i = 0; i < arr.length; i++) {
//            //已经有序的不再比较
//            for (int j = 0; j < arr.length-i-1; j++) {
//                //稳定的，
//                if(arr[j]>arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        //降序，向后冒泡
//        for (int i = 0; i < arr.length; i++) {
//            //已经有序的不再比较
//            for (int j = 0; j < arr.length-i-1; j++) {
//                //稳定的
//                if(arr[j]<arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        //升序，向前冒泡
//        for (int i = 0; i < arr.length-1; i++) {
//            //已经有序的不再比较
//            for (int j = arr.length-1; j>i; j--) {
//                //稳定的
//                if(arr[j]<arr[j-1]){
//                    temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
        //降序，向前冒泡
        for (int i = 0; i < arr.length-1; i++) {
            //已经有序的不再比较
            for (int j = arr.length-1; j>i; j--) {
                //稳定的
                if(arr[j]>arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
