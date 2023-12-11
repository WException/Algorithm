package lanqiao;

import java.util.Scanner;

public class lq_4867_大厨小新的美食烹饪 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[200];//记录每个字符出现的次数
        for(int i=0;i<N;i++){
            String temp = scan.next();
            //统计每个字符出现的次数
            for(int j=0;j<temp.length();j++){
                arr[temp.charAt(j)]++;
            }
        }
        // 判断l a n q i o的次数
        int ii = Math.min(arr['l'], arr['a']/2);
        int jj = Math.min(ii, arr['n']);
        int kk = Math.min(jj, arr['q']);
        int ll = Math.min(kk, arr['i']);
        int pp = Math.min(ll, arr['o']);
        System.out.println(pp);
        scan.close();
    }
}
