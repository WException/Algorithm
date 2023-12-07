package lanqiao;

import java.util.Scanner;

public class lq_3915_小蓝的糖果交换 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr_a = new int[N], arr_b = new int[N];
        for(int i=0;i<N;i++) arr_a[i] = scan.nextInt();
        for(int i=0;i<N;i++) arr_b[i] = scan.nextInt();

        if(is_equal(arr_a,arr_b)){
            System.out.print("Yes");
            return;
        }
        //如果有相同元素的数量超过N，则不可能存在
        for(int i=0;i<N;i++){
            int tmp = 0;
            //判断i的数量是否超过N
            for(int j=0;j<N;j++){
                if(arr_a[i] == arr_a[j]) tmp++;
                if(arr_a[i] == arr_b[j]) tmp++;
            }
            if(tmp > N){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
        scan.close();
    }

    public static boolean is_equal(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == arr2[i]){
                return false;
            }
        }
        return true;
    }
}
