package lanqiao;

import java.util.Scanner;

public class lq_297_实现选择排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tmp = 0;
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = scan.nextInt();
        //选择排序
        selectionSort(nums);
        for(int i=0;i<n;i++) System.out.print(nums[i]+" ");
        scan.close();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
