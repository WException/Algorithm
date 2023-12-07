package lanqiao;

import java.util.Scanner;

public class lq_2413_清理水域 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //n行m列矩形水域, t:清理次数
        int n=scan.nextInt(),m=scan.nextInt(),t=scan.nextInt();
        //res表示该水域，false表示没有被清理
        boolean[][] res = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = false;
            }
        }

        for(int i=0;i<t;i++){
            //每次清理r1-r2行，c1-c2列
            int r1=scan.nextInt(),c1=scan.nextInt();
            int r2=scan.nextInt(),c2=scan.nextInt();
            // System.out.println("r1="+r1+"r2="+r2);
            // System.out.println("c1="+c1+"c2="+c2);
            for(int j=r1-1;j<=r2-1;j++){
                for(int k=c1-1;k<=c2-1;k++){
                    res[j][k] = true;
                }
            }
        }
        //判断剩余多少个未清理区域(false)
        //
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(res[i][j] == false) sum+=1;
            }
        }
        System.out.print(sum);
        scan.close();
    }
}
