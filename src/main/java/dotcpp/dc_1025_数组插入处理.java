package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

public class dc_1025_数组插入处理 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0;i<10;i++) nums[i]=scanner.nextInt();
        Arrays.sort(nums);
        for(int i=0;i<10;i++) System.out.println(nums[i]);
        scanner.close();
    }
}
