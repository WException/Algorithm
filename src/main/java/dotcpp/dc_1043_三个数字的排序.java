package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

public class dc_1043_三个数字的排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        scan.close();
    }
}
