package leetcode;

public class lc_9_回文数 {
    public static boolean isPalindrome(int x) {
        String  a = String.valueOf(x);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(int x) {
        if (x<0 || x%10==0 && x!=0) return false;
        int temp = 0;
        while (x>temp){
            temp = temp*10 + x%10;
            x/=10;
        }
        return x==temp || x==temp/10;
    }

    public static void main(String[] args) {
        boolean flag = isPalindrome2(1233212);
        System.out.println(flag);
    }
}
