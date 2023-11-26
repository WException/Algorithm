package lanqiao;

import java.util.Scanner;

public class lq_6277_最小数位和 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int[] nums = new int[100];
         int res = 100, index = 0;
         for(int i=0;i<64;i++){
           nums[i] = scan.nextInt();
           if(getSum(nums[i])<res){
             res = getSum(nums[i]);
             index = i;
           }
         }
         System.out.println(nums[index]);
         scan.close();
    }

    //求数位和
    public static int getSum(int num){
        int res = 0;
        while(num >= 10){
            res = res + num%10;
            num = num / 10;
        }
        return res + num%10;
    }
}
