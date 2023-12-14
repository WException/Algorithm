package lanqiao;

import java.util.Scanner;

public class lq_323_用杂志拼接信件 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String magazine = scan.nextLine();//杂志
        String letter = scan.nextLine();//信件
        //判断信件是否为杂志的子串
        for(int i = 0;i<magazine.length()-letter.length();i++){
            if(magazine.startsWith(letter, i)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        scan.close();
    }
}
