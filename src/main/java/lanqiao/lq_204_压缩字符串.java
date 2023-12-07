package lanqiao;

import java.util.Scanner;

public class lq_204_压缩字符串 {
    public static String compressString(String str) {
        int count = 1;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count ==1 ) {
                    res.append(str.charAt(i));
                }else {
                    res.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
        }
        // 处理最后一个字符
        res.append(str.charAt(str.length() - 1)).append(count);
        // 判断压缩后的字符串长度是否比原字符串短
        return res.length() >= str.length()? "NO" : res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(compressString(sc.nextLine()));
    }
}
