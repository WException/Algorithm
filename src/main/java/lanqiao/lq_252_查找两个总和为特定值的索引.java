package lanqiao;

import java.util.Scanner;

public class lq_252_查找两个总和为特定值的索引 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int[] nums = new int[l];
        for(int i=0;i<l;i++) {
            nums[i] = scan.nextInt();
        }
        int n = scan.nextInt();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == n){
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }
        scan.close();
    }
}
