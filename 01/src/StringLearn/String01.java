package StringLearn;

public class String01 {
    public static void main(String[] args) {

        String s1 = new String("112");
        String s2 = new String("112");
        String s3 = "112";
        String s4 = "112";
        if(s1==s2){
            System.out.println("s1==s2");
        }
        if(s1==s3){
            System.out.println("s1==s3");
        }
        if(s3==s4){
            System.out.println("s3==s4");
        }
// == 比较分两种，基本类型比较值，引用类型比较地址

        if(s1.equals(s2)){
            System.out.println("s1 equals s2");
        }
        if(s1.equals(s3)){
            System.out.println("s1 equals s3");
        }
        if(s3.equals(s4)){
            System.out.println("s3 equals s4");
        }
// equals 比较值
    }
}
