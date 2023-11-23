package leetcode;

public class lc_100131_使三个字符串相等 {
    public static void main(String[] args) {
        System.out.println(findMinimumOperations("abc", "ab", "abb"));
    }
    public static int findMinimumOperations(String s1, String s2, String s3) {
        //寻找是否有公共前缀
        int n = Math.min(Math.min(s1.length(),s2.length()), s3.length());
        int l = 0;
        for (int i = 0; i < n; i++) {
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                l++;
            } else {
                break;
            }
        }
        if (l == 0) return -1;
        //每个字符串减去最小公共前缀剩余的长度相加为结果
        return s1.length()-l+s2.length()-l+s3.length()-l;
    }
}
