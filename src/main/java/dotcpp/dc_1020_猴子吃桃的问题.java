package dotcpp;

import java.util.Scanner;

public class dc_1020_猴子吃桃的问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
        // 4
        // 10
        // 22
        int res = 1;
        int N = scanner.nextInt();
        for (int j = 1; j < N; j++) {
            res= (res+1)*2;
        }
        System.out.println(res);
        scanner.close();
    }
}
