package lanqiao;

import java.util.Scanner;

public class lq_251_找到给定字符串中的不同字符 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1=scan.next(),str2=scan.next();
        int[] flag1 = new int[200],flag2 = new int[200];

        for(int i=0;i<str1.length();i++) flag1[(int)str1.charAt(i)]+=1;
        for(int i=0;i<str2.length();i++) flag2[(int)str2.charAt(i)]+=1;

        //比较flag1和flag2，找出相差为1的key
        for(int i=0;i<200;i++){
            int diff = Math.abs(flag1[i] - flag2[i]);
            if(diff == 1){
                System.out.print((char)i);
            }
        }
        scan.close();
    }
}
