package lanqiao;

import java.util.Scanner;

public class lq_203_确定字符串是否是另一个的排列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next(),str2 = scan.next();
        int[] arr1 = new int[200],arr2 = new int[200];
        for(int i=0;i<str1.length();i++) arr1[str1.charAt(i)+'0']+=1;
        for(int i=0;i<str2.length();i++) arr2[str2.charAt(i)+'0']+=1;
        //判断arr1和arr2是否相同
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
        scan.close();
    }
}
