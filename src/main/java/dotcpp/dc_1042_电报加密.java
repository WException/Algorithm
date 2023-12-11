package dotcpp;

import java.util.Scanner;

public class dc_1042_电报加密 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='z')
                res.append('a');
            else if(str.charAt(i)>='a' && str.charAt(i)<'z')
                res.append((char)((int)str.charAt(i)+1));
            else
                res.append(str.charAt(i));
        }
        System.out.println(res.toString());
        scanner.close();
    }
}
