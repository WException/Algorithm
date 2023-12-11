package lanqiao;

import java.util.Scanner;

public class lq_8238_马拉松奖励 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            long X = scan.nextLong();
            long Y = scan.nextLong();
            long res = X*10 + Y*90;
            System.out.println(res);
        }
        scan.close();
    }
}
