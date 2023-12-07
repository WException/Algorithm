package lanqiao;

import java.util.Scanner;

public class lq_7944_最大落差 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }

        int res = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                res = Math.max(nums[i]-nums[i+1], res);
            }
        }
        System.out.println(res);
        scan.close();
    }
}
