package dotcpp;

import java.util.Scanner;

public class dc_1019_自由下落的距离计算 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double M = scan.nextDouble();
        double N = scan.nextDouble();
        //反弹多高 = M除N次2
        //总距离数 = M+M/2 + M/2+M/4 + M/4+M/8...
        double num1 = M;
        double num2 = 0;
        int j = 1;
        for (int i = 0; i < N; i++) {
            num1 = num1 / 2;
            num2 += M/j+M/(j*2);
            j*=2;
        }
        //cSn=a1 (1-q^n)/ (1-q)
        num2 = M*(1-Math.pow(0.5, N))/(1-0.5) + (M/2)*(1-Math.pow(0.5, N))/(1-0.5);

        System.out.printf("%.2f %.2f",num1,(num2-num1));
        scan.close();
    }
}
