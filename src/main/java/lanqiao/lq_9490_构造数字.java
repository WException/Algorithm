package lanqiao;

import java.util.Scanner;

public class lq_9490_构造数字 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        // M<9
        // M/9 个 9 + m%9
        StringBuilder s = new StringBuilder();
        //判断M是否过大
        if(M/9.0<=N){
            for(int i=0;i<M/9;i++){
                s.append(9);
            }
            s.append(M%9);
            for(int i=0;i<N-(M/9)-1;i++){
                s.append(0);
            }
            System.out.println(s);
        } else {
            for(int i=0;i<N;i++){
                s.append(9);
            }
            System.out.println(s);
        }

        scan.close();
    }
}
