package lanqiao;

import java.util.Scanner;

public class lq_7943_区间最大和 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n         = scan.nextInt();
        int k         = scan.nextInt();
        long[] nums   = new long[n];
        long sum      = 0;
        long res      = 0;

        for(int i=0;i<nums.length;i++) nums[i]  = scan.nextLong();

        //区间长度为k
        //需要考虑的情况为：0~k-1, 1~k, 2~k+1, 3~k+2
        for(int i=0;i<n+1-k;i++){
            for(int j=i;j<=k+i-1;j++){
                sum+=nums[j];
            }
            res=Math.max(sum, res);
            sum=0;
        }
        System.out.print(res);
        scan.close();
    }
}
