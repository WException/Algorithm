package lanqiao;

import java.util.Scanner;

public class lq_3621_最长子串 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        System.out.println(double_(s, k));
        scan.close();
    }

    //双指针法
    static long double_(String s, int k){
        int l=0,r=0;
        int[] cnt = new int[26];
        long ans=0;
        int n=s.length();
        while(l<n) {
            while(r<n) {
                if(cnt[s.charAt(r)-'a']==k) break;
                cnt[s.charAt(r)-'a']+=1;
                r+=1;
            }
            ans=Math.max(ans,(long)(r-l));
            cnt[s.charAt(l)-'a']-=1;
            l++;
        }
        return ans;
    }

    //暴力破解法(运行超时-只通过80%测试用例)
    static long baoli(String str, int len){
        long res = 0;
        int tmp_res = 0;
        int[] count = new int[200];//记录字符出现的次数
        for(int i=0;i<str.length();i++){
            //0 01 012 0123 ...
            //1 12 123 ...
            for(int j=i;j<str.length();j++){
                char c = str.charAt(j);
                count[c]++;
                if(count[c] > len){
                    break;
                } else {
                    tmp_res++;
                }
            }
            res = Math.max(res,tmp_res);
            tmp_res=0;
            count=new int[200];
        }
        return res;
    }
}
