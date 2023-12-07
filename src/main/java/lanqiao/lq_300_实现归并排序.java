package lanqiao;

import java.util.Scanner;

// TODO 待学习
public class lq_300_实现归并排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++) nums[i] = scan.nextInt();
        mergeSort(nums);
        for (int num : nums) System.out.print(num + " ");
        scan.close();
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return; // 如果数组长度小于等于1，则已经有序，无需排序
        }
        int mid = arr.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length - mid];

        // 将原始数组按照中间位置拆分成两个子数组
        System.arraycopy(arr, 0, leftArray, 0, mid);
        System.arraycopy(arr, mid, rightArray, 0, arr.length - mid);

        // 递归对左右子数组进行归并排序
        mergeSort(leftArray);
        mergeSort(rightArray);

        // 合并左右子数组
        merge(arr, leftArray, rightArray);
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        // 处理剩余的元素
        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
    }
}
