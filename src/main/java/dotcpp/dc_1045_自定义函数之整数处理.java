package dotcpp;

import java.util.Scanner;

//TODO 50%样例未通过
public class dc_1045_自定义函数之整数处理 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int min_inx = 0;
        int max_inx = 0;
        //找出最大和最小的数，并记录下标
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] > arr[max_inx]){
                max_inx = i;
            }
            if(arr[i] < arr[min_inx]){
                min_inx = i;
            }
        }
        //替换 0与min_index   9与max_index
        int tmp = 0;
        tmp = arr[0];
        arr[0] = arr[min_inx];
        arr[min_inx] = tmp;

        tmp = arr[9];
        arr[9] = arr[max_inx];
        arr[max_inx] = tmp;

        //输出arr
        for (int j : arr) {
            System.out.print(j+" ");
        }
        scan.close();
    }
}
