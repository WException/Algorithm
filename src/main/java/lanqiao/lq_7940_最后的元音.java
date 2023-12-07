package lanqiao;

import java.util.Scanner;

//倒叙暴力查找
public class lq_7940_最后的元音 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String  str  = scan.next();
            for(int i=str.length()-1;i>=0;i--){
                if(isVowel(str.charAt(i))){
                    System.out.print(str.charAt(i));
                    break;
                }
            }
            scan.close();
        }

        public static boolean isVowel(char s){
            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')
                return true;
            else
                return false;
        }
    }
}
