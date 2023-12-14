package lanqiao;

import java.util.Scanner;

public class lq_324_乌托邦树 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        // 翻倍 +1 翻倍 +1 翻倍 +1 ......
        int sum = 1;
        int N = scan.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2==0)
                sum+=1;
            else
                sum*=2;
        }
        System.out.println(sum);
        scan.close();
    }
}
