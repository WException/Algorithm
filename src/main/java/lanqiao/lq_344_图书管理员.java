package lanqiao;

import java.util.Scanner;

public class lq_344_图书管理员 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//书数量
        int p = scan.nextInt();//读者数量
        int[] book_num = new int[n];
        for(int i=0;i<book_num.length;i++){
            book_num[i] = scan.nextInt();
        }
        int[][] people_num = new int[p][2];
        for(int i=0;i<p;i++){
            people_num[i][0] = scan.nextInt();
            people_num[i][1] = scan.nextInt();
        }
        //找书
        for(int i=0;i<p;i++){
            int bn = people_num[i][1];//需要的书号
            int bl = people_num[i][0];//书号长度
            boolean flag = false;
            int tmp = Integer.MAX_VALUE;//记录找到的书号
            for(int j=0;j<book_num.length;j++){
                if(bn == book_num[j]%(int)Math.pow(10, bl)){
                    //找到此书
                    flag = true;
                    tmp=Math.min(tmp, book_num[j]);
                }
            }
            if(flag){
                System.out.println(tmp);
            }
            else{
                System.out.println(-1);
            }
        }
        scan.close();
    }
}
