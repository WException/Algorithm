package lanqiao;

import java.util.Scanner;

public class lq_9496_小蓝的金牌梦 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n2 = scan.nextInt();
        int[] nums = new int[n2];
        for(int i=0;i<nums.length;i++) nums[i] = scan.nextInt();
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        long maxSum = Integer.MIN_VALUE;
        // 计算前缀和
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        for (int len = 2; len <= n; len++) {
            if (isPrime(len)) {
                for (int i = len; i <= n; i++) {
                    long sum = prefixSum[i] - prefixSum[i - len];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        System.out.println(maxSum);
        scan.close();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
