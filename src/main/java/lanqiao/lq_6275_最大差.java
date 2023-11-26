package lanqiao;

import java.util.Scanner;

public class lq_6275_最大差 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[30][20];
        for(int r=0;r<30;r++){
            for(int c=0;c<20;c++){
                nums[r][c] = scan.nextInt();
            }
        }
        //枚举所有元素的差值，存储并记录差值对应的两个坐标
        int res = 0;
        for(int r=0;r<30;r++){
            for(int c=0;c<20;c++){
                for(int r1=0;r1<30;r1++){
                    for(int c1=0;c1<20;c1++){
                        if(Math.abs(r-r1)+Math.abs(c-c1)<=5){
                            int tmp = nums[r][c] - nums[r1][c1];
                            res = Math.max(res,Math.abs(tmp));
                        }
                    }
                }
            }
        }
        System.out.println(res);
        //在此输入您的代码...
        scan.close();
    }
}
