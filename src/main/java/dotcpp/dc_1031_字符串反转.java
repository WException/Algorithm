package dotcpp;

import java.util.Scanner;

public class dc_1031_字符串反转 {
    public static void main(String[] args) {
        System.out.print(new StringBuilder(new Scanner(System.in).next()).reverse());
    }

    public static void demo(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder res = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            res.append(str.charAt(i));
        }
        System.out.println(res);
        scan.close();
    }
}
