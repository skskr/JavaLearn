package StringLearn;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "wjl";
        String password = "wjl123";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();

            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("欢迎!");
                return;
            }
            else {
                System.out.println("你还有"+(2-i)+"次机会");
            }
        }

    }

}
