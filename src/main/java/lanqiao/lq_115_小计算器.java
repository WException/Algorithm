package lanqiao;

import java.util.Scanner;

//TODO 待做 考虑小数点 考虑进制转换
public class lq_115_小计算器 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] steps = new String[n];
        for(int i=0;i<n;i++) steps[i]=scan.nextLine();

        long res = 0;//计算结果
        long num = 0;//寄存num
        //分析指令: NU AD SU MU DI MO CH EQ CL
        for(int i=0;i<steps.length;i++){
            String inst = steps[i];
            String in   = inst.substring(0,2);
            if(in.equals("NU")){
                //NUM指令 输入一个数字。此时要判断NUM指令的上一条
                String in_up = steps[i-1].substring(0,2);
                if(in_up.equals("CL")){
                    //清除指令
                    res = Integer.parseInt(inst.split(" ")[1]);
                } else if(in_up.equals("AD")){
                    //相加指令
                    res += Integer.parseInt(inst.split(" ")[1]);
                } else if(in_up.equals("SU")){
                    //减法指令
                    res -= Integer.parseInt(inst.split(" ")[1]);
                } else if(in_up.equals("MU")){
                    //乘法指令
                    res *= Integer.parseInt(inst.split(" ")[1]);
                } else if(in_up.equals("DI")){
                    //除法取商
                    res /= Integer.parseInt(inst.split(" ")[1]);
                } else if(in_up.equals("MO")){
                    //除法取余
                    res = res % Integer.parseInt(inst.split(" ")[1]);
                }
            } else if(in.equals("EQ")){
                System.out.println(res);
            }
        }
        scan.close();
    }
}
