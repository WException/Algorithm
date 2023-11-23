package lanqiao;

import java.util.Scanner;

public class lq_6270_对折次数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long L = scan.nextLong();
        long tmp = 1;
        int res = 0;
        while(L>tmp){
            tmp*=2;
            res++;
        }
        System.out.println(res);
        scan.close();

        // 1.如果单纯使用浮点数，会出现浮点数错误，浮点数不能直接用于 == 比较
        // 2.逆向思考，使用整数，模拟，我们从 1 开始乘以 2，直到大于等于L。
//        Scanner scan = new Scanner(System.in);
//        double L = scan.nextDouble();
//        int res = 0;
//        while(L>1){
//            L/=2;
//            res++;
//        }
//        System.out.println(res);
//        scan.close();
    }
}
