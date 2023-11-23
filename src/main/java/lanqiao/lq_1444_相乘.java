package lanqiao;

public class lq_1444_相乘 {
    public static void main(String[] args) {
        boolean flag = false;
        for (long i = 1; i <= 1000000007; i++) {
            if (i*2021 % 1000000007 == 999999999){
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println(0);
        }
    }
}
