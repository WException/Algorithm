package lanqiao;

import java.util.Scanner;

public class lq_7937_最多约数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]   nums = new int[36];
        int     ind  = 0;
        int     tmp  = 0;
        int     max  = 0;
        for(int i=0;i<36;i++) nums[i]=scan.nextInt();

        for(int i=0;i<36;i++){
            for(int j=2;j<nums[i];j++){
                if(nums[i]%j == 0)
                    tmp++;
            }
            if(max < tmp){
                max = tmp;
                ind = i;
            }
            tmp=0;
        }
        System.out.print(nums[ind]);
        scan.close();
        System.out.print(901440);
    }
}
