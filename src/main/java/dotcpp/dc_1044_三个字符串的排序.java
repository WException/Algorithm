package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

public class dc_1044_三个字符串的排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        String[] arr = {str1,str2,str3};
        Arrays.sort(arr);
        for (String j : arr) {
            System.out.println(j);
        }
        scan.close();
    }
}
