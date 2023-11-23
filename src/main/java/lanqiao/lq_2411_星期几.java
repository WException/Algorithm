package lanqiao;

import java.util.Scanner;

public class lq_2411_星期几 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt(), n = scan.nextInt();
        if((w+n)%7 == 0){
            System.out.println(7);
        } else{
            System.out.println((w+n)%7);
        }
        //在此输入您的代码...
        scan.close();
    }
}
