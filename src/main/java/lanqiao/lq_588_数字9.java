package lanqiao;

public class lq_588_数字9 {
    public static void main(String[] args) {
        int res=0;
        for(int i=1;i<=2019;i++){
            if(i%10==9){
                res++;
                continue;
            }
            else if ((i/10)%10==9) {
                res++;
                continue;
            }
            else if ((i/100)%10==9) {
                res++;
                continue;
            }
        }
        System.out.print(res);
    }
}
