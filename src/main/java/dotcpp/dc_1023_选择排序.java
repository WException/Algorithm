package dotcpp;

import java.util.Scanner;

public class dc_1023_选择排序 {
    public static void main(String[] args) {
        //输入10个数，从小到大排序
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0;i<nums.length;i++) nums[i] = scanner.nextInt();
        //选择排序就是每次找到最小的，放到已经排序好的队列后面
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        for(int i=0;i<nums.length;i++) System.out.println(nums[i]);
        scanner.close();
    }
}
