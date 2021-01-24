package StringLearn;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb=" + sb);
        System.out.println("sb2=" + sb2);
        System.out.println(sb == sb2);
        sb2.append(100);
        System.out.println(sb);
        System.out.println(sb2.reverse());

        String str = sb.toString();
        System.out.println(str);
        String str2 = "iiiiooo";
        sb2 = new StringBuilder(str2);
        System.out.println(sb2);


    }
}
