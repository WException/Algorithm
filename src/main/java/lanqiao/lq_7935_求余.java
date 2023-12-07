package lanqiao;

public class lq_7935_求余 {
    public static void main(String[] args) {
         int res = 1;
         for(int i=0;i<2023;i++){
             res = (2*res) % 1000;
         }
         System.out.print(res);
    }
}
