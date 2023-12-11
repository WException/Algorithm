package lanqiao;

import java.util.Scanner;

public class lq_4125_鸡哥的奇特密码 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            if (!(i > 0 && str.charAt(i) == 'L' && str.charAt(i - 1) == 'L'))
                res.append(str.charAt(i));
        System.out.println(res.toString());
        scan.close();
    }
}
