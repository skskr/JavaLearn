package arraylearn;

public class Arrray01 {
    public static void main(String[] args) {
        int[] grade = new int[10];
        for (int i = 0; i < 10; i++) {
            grade[i] = i;
            System.out.println(grade[i]);
            isEven(i);
        }
    }

    public static void method01(){
        System.out.println("method01");
    }
    public static void method02(){
        System.out.println("method02");
    }
    public static void isEven(int j){
        if((j&1)==0){
            method01();
        }
        else {
            method02();
        }
    }
}
