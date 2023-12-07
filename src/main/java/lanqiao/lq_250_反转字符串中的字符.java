package lanqiao;

import java.util.Scanner;

public class lq_250_反转字符串中的字符 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] res = new char[str.length()];

        for(int i=0;i<str.length();i++){
            res[i] = str.charAt(str.length()-1-i);
            System.out.print(res[i]);
        }
        scan.close();
    }
}
