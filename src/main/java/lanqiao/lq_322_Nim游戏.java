package lanqiao;

import java.util.Scanner;

//TODO 待理解
public class lq_322_Nim游戏 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%4==0)
            System.out.println("NO");
        else
            System.out.println("YES");
        scan.close();
    }
}
