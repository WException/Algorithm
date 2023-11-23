package dotcpp;

import java.math.BigDecimal;
import java.util.Scanner;

public class dc_esay_set {
    public static void main(String[] args) {
        _2772苹果和虫子();
    }

    public static void  _number(){

    }

    public static void  _2772苹果和虫子(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), x = scanner.nextInt(), y = scanner.nextInt();
        System.out.println(n - (int)Math.ceil(y*1.0/x));
        scanner.close();
    }

    public static void  _2771大象喝水(){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(), r = scanner.nextInt();;
        double v = Math.PI *r*r * h / 1000;
        System.out.println((int)Math.ceil(20/v));
        scanner.close();
    }

    public static void  _2770计算浮点数相除的余数(){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        BigDecimal xTwo = new BigDecimal(Double.toString(x));
        BigDecimal yTwo = new BigDecimal(Double.toString(y));
        BigDecimal n = xTwo.remainder(yTwo);
        System.out.println(n);
        // 这种方式会导致精度问题和小数点后无效0无法舍弃
        // System.out.printf("%g", x%y);
        scanner.close();
    }

    public static void  _2769计算并联电阻的阻值(){
        Scanner scanner = new Scanner(System.in);
        float r1 = scanner.nextFloat();
        float r2 = scanner.nextFloat();
        System.out.printf("%.2f",1/(1/r1 + 1/r2));
        scanner.close();
    }
}
