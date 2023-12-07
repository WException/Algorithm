package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

//TODO 待理解
public class lq_8106_时光之旅 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mod = 1440;//一天1440分钟
        int[] a = new int[100100];
        //

        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            String time = input.next();
            String[] parts = time.split(":");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            a[i] = x * 60 + y;
        }

        Arrays.sort(a, 0, n);
        a[n] = a[0];

        int ans = 1600;
        for (int i = 1; i <= n; ++i) {
            ans = Math.min(ans, (a[i] - a[i-1] + mod) % mod);
            ans = Math.min(ans, (a[i-1] - a[i] + mod) % mod);
        }

        System.out.println(ans);
    }
}

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int[] dateList = new int[n];
//         for(int i=0;i<n;i++){
//             String date_str = scan.next();
//             int h = Integer.parseInt(date_str.split(":")[0]);
//             int m = Integer.parseInt(date_str.split(":")[1]);
//             dateList[i] = h*60 + m;
//         }
//         //对dateList从小到大排序
//         Arrays.sort(dateList);
//         //计算每对相邻两项之间的差的绝对值，找出最小的值
//         int res = Integer.MAX_VALUE;
//         for(int i=0;i<dateList.length-1;i++){
//             int diff = Math.abs(dateList[i] - dateList[i+1]);
//             res = Math.min(res, diff);
//         }
//         System.out.print(res);
//         scan.close();
//     }
// }
