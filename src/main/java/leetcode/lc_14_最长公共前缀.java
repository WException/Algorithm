package leetcode;

public class lc_14_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].equals("")){
            return "";
        }else {
            char a = strs[0].charAt(0);
            boolean flag = true;
            String result = "";
            for (int i = 0; flag; i++) {
                for (String str : strs) {
                    if (str.length()-1 >= i){
                        if (a != str.charAt(i)){
                            flag = false;
                        }
                    }
                    else{
                        flag = false;
                    }
                }
                if (strs[0].length()-2 >= i){
                    a=strs[0].charAt(i+1);
                }
                if (flag){
                    result+=strs[0].charAt(i);
                }
            }
            return result;
        }
    }
}
