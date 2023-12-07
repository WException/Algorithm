package lanqiao;

import java.util.Scanner;

public class lq_299_实现快速排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++) nums[i] = scan.nextInt();
        quickSort(nums,0,N-1);
        for (int num : nums) System.out.print(num + " ");
        scan.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        // 选择基准元素
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // 将小于基准元素的放到左边，大于基准元素的放到右边
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // 递归对左右两部分进行快速排序
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}
