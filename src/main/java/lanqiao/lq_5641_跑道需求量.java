package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class lq_5641_跑道需求量 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        // 找出时间相同的最大值
        int[] count = new int[100001];
        for(int i=0;i<2*N;i++){
            int time = scan.nextInt();
            count[time]++;
        }
        Arrays.sort(count);
        System.out.println(count[count.length-1]);
        scan.close();

        /**
         * 第二种方式
         */
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Map<Integer, Integer> map = new TreeMap<>();
        // for (int i = 0; i < 2 * n; i++) {
        //     int x = sc.nextInt();
        //     map.put(x, map.getOrDefault(x, 0) + 1);
        // }
        // int ans = 0;
        // for (int val: map.values()) {
        //     ans = Math.max(ans, val);
        // }
        // System.out.println(ans);
    }
}
