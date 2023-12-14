package lanqiao;

import java.util.Scanner;

// TODO 补全动态规划的方式
public class lq_305_查找最长的公共子序列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(baoli(str1, str2));
        scan.close();
    }
    //暴力破解
    static String baoli(String str1,String str2){
        String res = "";
        int len = Integer.MIN_VALUE;
        //找出str1中所有的子串和str2对比，然后取最长的那个
        for(int i=0;i<str1.length();i++){
            //i~i,i~i+1,i~i+2,...,i~i+n  n=length-i-1
            for(int j=0;j<str1.length()-i;j++){
                int start = i;
                int end   = i+j;
                String tmp = str1.substring(start,end);
                // System.out.println(tmp);
                //判断tmp是否为str2的子串
                // System.out.println(str2.indexOf(tmp));
                if(str2.indexOf(tmp) != -1){
                    if(len<tmp.length()){
                        // System.out.println(tmp.length());
                        len = tmp.length();
                        res = tmp;
                    }
                }
            }
        }
        return res;
    }
}
