package lanqiao;

import java.util.Scanner;

public class lq_6268_第三小 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //a1是最小，a2是次小，a3是第三小
        int x,a1=10000000,a2=10000000,a3=10000000;
        for(int i=1;i<=n;i++){
            x = scan.nextInt();
            if(x<=a1){
                a3=a2;
                a2=a1;
                a1=x;
            }
            else if(x<=a2){
                a3=a2;
                a2=x;
            }
            else if(x<=a3){
                a3=x;
            }
            if(i>=3){
                System.out.print(a3+" ");
            }
        }
        scan.close();
    }
}
