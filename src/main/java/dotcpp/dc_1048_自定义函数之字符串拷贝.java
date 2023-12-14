package dotcpp;

import java.util.Scanner;

public class dc_1048_自定义函数之字符串拷贝 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        int m = scan.nextInt();

        String res = str.substring(m-1);
        System.out.println(res);
        scan.close();
    }
}
