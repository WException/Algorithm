package lanqiao;

import java.util.Scanner;

public class lq_343_成绩 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt()*2 + scan.nextInt()*3 + scan.nextInt()*5;
        System.out.println(res/10);
        scan.close();
    }
}
