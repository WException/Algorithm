package lanqiao;

import java.util.Scanner;

public class lq_6273_统计次数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        byte[] arr2 = str.getBytes();
        int[] arr = new int[10];
        for(byte i: arr2){
            arr[i-48]+=1;
        }
        for (int i : arr) {
            System.out.printf(i+" ");
        }
        scan.close();
    }
}
