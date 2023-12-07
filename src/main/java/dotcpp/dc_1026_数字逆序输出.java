package dotcpp;

import java.util.Scanner;

public class dc_1026_数字逆序输出 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0;i<10;i++) nums[i]=scanner.nextInt();
        for(int i=9;i>=0;i--) System.out.print(nums[i]+" ");
        scanner.close();
    }
}
