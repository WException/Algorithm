package dotcpp;

import java.util.Scanner;

//一个数如果恰好等于不包含它本身所有因子之和，这个数就称为"完数"。
// 例如，6的因子为1、2、3，而6=1+2+3，因此6是"完数"。
// 编程序找出N之内的所有完数，并按下面格式输出其因子
public class dc_1017_完数的判断 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N= scan.nextInt();
        for (int i = 2; i <= N; i++) {
            int tmp=0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    tmp=tmp+j;
                }
            }
            if(tmp==i){
                System.out.print(i+" "+"its factors are"+" ");
                for (int j = 1; j < i; j++) {
                    if(i%j==0){
                        // 这种输出格式可以由此来实现
                        System.out.print(j+" ");
                    }
                }
                System.out.println();
            }
        }
        scan.close();
    }
}
