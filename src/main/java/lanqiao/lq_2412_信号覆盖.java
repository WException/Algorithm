package lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lq_2412_信号覆盖 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        int n = scan.nextInt();
        int R = scan.nextInt();

        List<int[]> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            // 存储每个站点的位置
            int x = scan.nextInt();
            int y = scan.nextInt();
            int[] tmpArr = new int[2];
            tmpArr[0] = x;
            tmpArr[1] = y;
            list.add(tmpArr);
        }

        // 判断每个坐标点是否在站点信号范围内
        int result = 0;
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j <= H; j++) {
                for (int[] x : list) {
                    int l = (x[0] - i) * (x[0] - i) + (x[1] - j) * (x[1] - j);
                    if (l <= R * R) {
                        result++;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        scan.close();
    }
}
