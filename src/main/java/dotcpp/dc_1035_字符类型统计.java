package dotcpp;

import java.util.Scanner;

public class dc_1035_字符类型统计 {
    public static void chuli(String str){
        int a=0, b=0, c=0, d=0;
        for(int i=0;i<str.length();i++){
            if(('a'<=str.charAt(i)&&str.charAt(i)<='z')||('A'<=str.charAt(i)&&str.charAt(i)<='Z'))
                a++;
            else if('0'<=str.charAt(i)&&str.charAt(i)<='9')
                b++;
            else if(str.charAt(i)==' ')
                c++;
            else
                d++;
        }
        System.out.print(a+" "+b+" "+c+" "+d);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        chuli(scan.nextLine());
    }
}
