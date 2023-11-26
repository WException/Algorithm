package lanqiao;

import java.util.Scanner;

public class lq_6276_最尖位置 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int res = 0;
        for(int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if(nums[i-1]>nums[i] && nums[i+1]>nums[i]){
                int tmp = (nums[i-1]-nums[i]) * (nums[i+1]-nums[i]);
                res = Math.max(res, tmp);
            }
        }
        System.out.println(res);
        scan.close();
    }
}
