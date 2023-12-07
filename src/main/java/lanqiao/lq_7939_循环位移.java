package lanqiao;

import java.util.Scanner;

public class lq_7939_循环位移 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arr   = scan.next().toCharArray();
        char[] res   = new char[6];
        res[0] = arr[1];
        res[1] = arr[2];
        res[2] = arr[3];
        res[3] = arr[4];
        res[4] = arr[5];
        res[5] = arr[0];
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
        scan.close();
    }
}
