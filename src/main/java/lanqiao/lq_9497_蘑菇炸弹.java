package lanqiao;

import java.util.Scanner;

public class lq_9497_蘑菇炸弹 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int res = 0;

        for(int i=0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        for(int i=1;i<=n-2;i++){
            if(nums[i]>=nums[i-1]+nums[i+1]){
                res++;
            }
        }
        System.out.println(res);
        scan.close();
    }
}
