package lanqiao;

import java.util.Scanner;

public class lq_319_格式化许可证密钥 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sk = scan.nextLine();
        int k = scan.nextInt();
        sk = sk.replace("-","").toUpperCase();
        // 第一组的字符数等于sk.length % k

        StringBuilder res = new StringBuilder();
        int i=0;
        if(sk.length() % k != 0){
            for(;i<sk.length() % k;i++){
                res.append(sk.charAt(i));
            }
            res.append("-");
        }
        // 拼接剩余的字符串
        int j = 0;
        for(;i<sk.length();i++){
            res.append(sk.charAt(i));
            j++;
            if(j%k==0 && i<sk.length()-1){
                res.append("-");
            }
        }
        System.out.println(res.toString());
        scan.close();
    }
}
