package dotcpp;

import java.util.Scanner;

public class dc_1024_矩形对角线求和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[9];
        for(int i=0;i<nums.length;i++) nums[i] = scanner.nextInt();
        //主对角线 0+4+8, 副对角线2+4+6
        System.out.print((nums[0]+nums[4]+nums[8])+" "+(nums[2]+nums[4]+nums[6]));
        scanner.close();
    }
}
