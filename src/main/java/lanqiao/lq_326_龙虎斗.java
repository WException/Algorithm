package lanqiao;

import java.util.Scanner;

public class lq_326_龙虎斗 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextLong();
        }
        long m  = scan.nextLong();
        int p1 = scan.nextInt();
        long s1 = scan.nextLong();
        long s2 = scan.nextLong();

        //天降神兵, 将p1位置的兵加s1
        arr[p1-1]+=s1;//232 3 28 // s2=2
        //龙：第i个的势力=(m-1-i)*arr[i]
        //虎：第i个的势力=(i+1-m)*arr[i]
        long[] arr2 = new long[arr.length];//存储势力
        long long_num = 0;
        long hu_num   = 0;
        for(int i=0;i<arr.length;i++){
            if( (i+1) < m){
                arr2[i] = (m-1-i)*arr[i];
                long_num+=arr2[i];
            }
            else if( (i+1) > m){
                arr2[i] = (i+1-m)*arr[i];
                hu_num+=arr2[i];
            }
            else if((i+1) == m){
                arr2[i] = -1;//分界线
            }
        }
        // System.out.println("long_num="+long_num+" hu_num="+hu_num);//14 18
        // 循环判断将s2加到哪个位置，使得差值最小
        // int diff = Math.abs(long_num-hu_num);
        long diff = Integer.MAX_VALUE;
        long index = -1;
        for(int i=0;i<arr.length;i++){
            if( (i+1) < m){
                if(diff > Math.abs(((long_num-arr2[i])+(m-1-i)*(arr[i]+s2)) - hu_num)){
                    index=i;
                    diff=Math.abs(((long_num-arr2[i])+(m-1-i)*(arr[i]+s2)) - hu_num);
                    // System.out.println("<diff="+diff);
                }
            }
            else if( (i+1) > m){
                if(diff > Math.abs(((hu_num-arr2[i])+(i+1-m)*(arr[i]+s2)) - long_num)){
                    index=i;
                    diff=Math.abs(((hu_num-arr2[i])+(i+1-m)*(arr[i]+s2)) - long_num);
                    // System.out.println(">diff="+diff);
                }
            }
            else if((i+1) == m){
                if(diff > Math.abs(long_num-hu_num)){
                    index=i;
                    diff=Math.abs(long_num-hu_num);
                    // System.out.println("==diff="+diff);
                }
            }
        }
        System.out.println(index+1);
        scan.close();
    }
}
