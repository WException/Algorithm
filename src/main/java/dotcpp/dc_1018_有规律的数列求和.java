package dotcpp;

import java.util.Scanner;

//有一分数序列： 2/1 3/2 5/3 8/5 13/8 21/13......
// 求出这个数列的前N项之和，保留两位小数。
public class dc_1018_有规律的数列求和 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a=2, b=1;
        double result = (double) a /b;
        for (int i = 1; i < N; i++) {
            a = a+b;
            b = a-b;
            result+= (double) a /b;
        }
        System.out.printf("%.2f", result);
    }
}
