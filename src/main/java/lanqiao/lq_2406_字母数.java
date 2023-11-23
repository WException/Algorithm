package lanqiao;

import java.util.Scanner;

public class lq_2406_字母数 {
    public static void main(String[] args) {
        // TODO 完成暴力破解法
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = 2022;
        while(true){
            n++;
            //转16进制
            String tmp= Integer.toHexString(n);
//            System.out.println(tmp);
            //判断是否全为字母
            boolean flag = true;
            for(int i=0;i<tmp.length();i++){
                if(tmp.charAt(i) != 'a'
                        || tmp.charAt(i) != 'b'
                        || tmp.charAt(i) != 'c'
                        || tmp.charAt(i) != 'd'
                        || tmp.charAt(i) != 'e'
                        || tmp.charAt(i) != 'f'){
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(n);
        scan.close();
    }

    public static void test2(){
        //先求出2022的16进制为 7e6
        // System.out.println(Integer.toHexString(2022));
        //可知满足条件的最小数为 aaa
        System.out.println(10*16*16 + 10*16 + 10);
    }
}
