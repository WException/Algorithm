package lanqiao;

import java.util.Scanner;

public class lq_347_买铅笔 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a_num = scan.nextInt(),a_price = scan.nextInt();
        int b_num = scan.nextInt(),b_price = scan.nextInt();
        int c_num = scan.nextInt(),c_price = scan.nextInt();
        int suma = n%a_num==0?(n/a_num):(n/a_num)+1;
        int sumb = n%b_num==0?(n/b_num):(n/b_num)+1;
        int sumc = n%c_num==0?(n/c_num):(n/c_num)+1;
        System.out.println(Math.min(Math.min(suma*a_price, sumb*b_price), sumc*c_price));
        scan.close();
    }
}
