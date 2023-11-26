package lanqiao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// TODO 学习Java的时间类
public class lq_1452_时间显示 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long time = scan.nextLong();
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(time))));
        System.out.println(sd);
        scan.close();
    }

    public static void test2(){
        // 第二种解法，时间复杂度O(1)
        Scanner scan = new Scanner(System.in);
        long time = scan.nextLong();
        //去掉毫秒
        time/=1000;
        //只保留最后一天
        time%=(24 * 60 * 60);
        System.out.printf("%02d:",time/3600);
        System.out.printf("%02d:",time/60%60);
        System.out.printf("%02d\n",time%60);
        scan.close();
    }
}
