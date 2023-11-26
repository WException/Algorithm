package lanqiao;

public class lq_6274_相似分解 {
    public static void main(String[] args) {
        int index = 1;
        boolean flag = true;
        for(int i=1;i<=Integer.MAX_VALUE;i++){
            //判断i是否可以相似分解
            for(int j=1;j<=i;j++){
                for(int k=1;k<=i;k++){
                    for(int l=1;l<=i;l++){
                        if(j*k*l==i){
                            if(Math.abs(j-k)<=2
                                    && Math.abs(j-l)<=2
                                    && Math.abs(l-k)<=2){
                                if (flag){
                                    System.out.println(index+" : "+i+" j="+j+",k="+k+",l="+l);
                                    index++;
                                    flag=false;
                                }
                            }
                        }
                    }
                }
            }
            flag = true;
            if(index > 23){
                break;
            }
        }
    }
}
