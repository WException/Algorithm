package lanqiao;

import java.util.Scanner;

public class lq_96_Excel地址 {
    public static void main(String[] args) {
        long num = new Scanner(System.in).nextLong();
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            res.append((char) ('A' + ((--num) % 26)));
            num /= 26;
        }
        System.out.println(res.reverse());
    }
}
