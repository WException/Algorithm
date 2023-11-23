package dotcpp;

import java.util.Scanner;

public class dc_1022_筛选N以内的素数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 2; i <= N; i++) {
            //判断i是否为素数
            for (int j = 2; j <= i; j++) {
                if (i%j==0 && j!=i){
                    break;
                }
                if (i == j){
                    System.out.println(j);
                }
            }
        }
        scanner.close();
    }
}
