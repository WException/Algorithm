package lanqiao;

import java.util.Scanner;

public class lq_307_最大化股票交易的利润 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] price_arr = new int[N];
        int max_diff = 1-10000; //题目中可知Ai的范围1~10000 则最小利润为1-10000

        for(int i=0;i<price_arr.length;i++){
            price_arr[i] = scan.nextInt();
        }

        // 遍历所有情况，记录利润最大的值
        for(int i=0;i<price_arr.length;i++){
            for(int j=i+1;j<price_arr.length;j++){
                int diff = price_arr[j] - price_arr[i];
                max_diff = Math.max(diff, max_diff);
            }
        }
        System.out.print(max_diff);
        scan.close();
    }
}
