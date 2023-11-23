package dotcpp;

import java.util.Scanner;

public class dc_2768_与圆相关的计算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double t = 3.14159;
        System.out.printf("%.4f %.4f %.4f",r*2,t*2*r,t*r*r);
    }
}
