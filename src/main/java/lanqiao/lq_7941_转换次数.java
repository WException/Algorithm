package lanqiao;

import java.util.Scanner;


public class lq_7941_转换次数 {

    //拆分字符串+递归
    static void sol(String num){
        long sum = 1;
        for(int i=0;i<num.length();i++){
            if(((int)num.charAt(i)-48) != 0)
                sum = sum * ((int)num.charAt(i)-48);
        }
        System.out.println(sum);
        if(sum>9)
            sol(String.valueOf(sum));
    }

    //取模+递归
    static  void sol(long num){
        long res = 1;
        while (num != 0){
            if(num%10 > 0)
                res*=num%10;
            num /= 10;
        }
        System.out.println(res);
        if (res > 9)
            sol(res);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sol(scan.next());
        scan.close();
    }
}
