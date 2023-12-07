package lanqiao;

import java.util.Scanner;

public class lq_298_实现插入排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++) nums[i] = scan.nextInt();
        // 插入排序
        insertionSort(nums);
        for (int num : nums) System.out.print(num + " ");
        scan.close();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
