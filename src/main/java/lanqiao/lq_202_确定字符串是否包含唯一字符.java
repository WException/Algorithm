package lanqiao;

import java.util.Scanner;

public class lq_202_确定字符串是否包含唯一字符 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] flag = new int[200];
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i)+'0';
            if(flag[index] != 0){
                System.out.print("NO");
                return;
            }
            flag[index] += 1;
        }
        System.out.print("YES");
        scan.close();
    }
}
