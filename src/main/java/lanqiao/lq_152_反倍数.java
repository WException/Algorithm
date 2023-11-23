package lanqiao;

import java.util.Scanner;

public class lq_152_反倍数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int result = 0;
        for(int i=1;i<=n;i++){
            if(i%a!=0 && i%b!=0 && i%c!=0){
                System.out.print(i+" ");
                result+=1;
            }
        }
        System.out.print(result);
        //在此输入您的代码...
        scan.close();
    }
}
