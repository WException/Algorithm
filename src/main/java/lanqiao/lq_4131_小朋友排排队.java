package lanqiao;

import java.util.Scanner;

//TODO 理解
public class lq_4131_小朋友排排队 {
    public static void main(String[] args) {
        //将最左边的0移到最左边的1的位置
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();

        char[] arr = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') {
                int l = Math.min(i - cnt, k);
                swapChars(arr, i, i - l);
                cnt++;
                k -= l;
            }
        }

        System.out.println(new String(arr));
    }

    private static void swapChars(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
