package lanqiao;

public class lq_587_约数个数 {
    public static void main(String[] args) {
         int res = 0;
         for(int i=1;i<=1200000;i++){
           if(1200000%i==0) res++;
         }
         System.out.println(res);
    }
}
