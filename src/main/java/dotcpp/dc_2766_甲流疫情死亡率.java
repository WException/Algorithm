package dotcpp;

import java.util.Scanner;

//输入仅一行，有两个整数，第一个为确诊数，第二个为死亡数。
//输出仅一行，甲流死亡率，以百分数形式输出，精确到小数点后3位。
public class dc_2766_甲流疫情死亡率 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        float c=((float)b/a)*100;
        System.out.print(String.format("%.3f",c)+"%");
    }
}
