package dotcpp;

import java.util.Scanner;

public class dc_1027_最大公约数与最小公倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt(),num2=scanner.nextInt();
        System.out.print(fun1(num1,num2)+" "+fun2(num1,num2));
        scanner.close();
    }

    //最大公约数
    public static int fun1(int num1, int num2){
        int res = Math.min(num1,num2);
        for(int i=res;i>0;i--){
            if(num1%i==0 && num2%i==0){
                res=i;
                break;
            }
        }
        return res;
    }

    //最小公倍数
    public static int fun2(int num1, int num2){
        int res = 1;
        while(true){
            if(res%num1==0 && res%num2==0) break;
            res++;
        }
        return res;
    }
}
