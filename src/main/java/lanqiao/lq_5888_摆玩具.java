package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class lq_5888_摆玩具 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }

        //算出每两个元素之间的极差
        long[] arr2 = new long[n-1];
        for (int i = 0; i <n-1; i++) {
            arr2[i] = arr[i+1] - arr[i];
//            System.out.print(arr2[i]+" ");
        }

        //找出极差最大的k个值
        Arrays.sort(arr2);

        //总极差-最大的几个极差
        long sum = arr[n-1] - arr[0];
//        System.out.println("总极差："+sum);
        for (int i = 0; i < k-1; i++) {
//            System.out.println("减极差："+arr2[n-2-i]);
            sum-=arr2[n-2-i];
        }
        System.out.println(sum);
        scan.close();
    }
}
