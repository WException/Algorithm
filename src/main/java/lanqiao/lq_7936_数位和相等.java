package lanqiao;

// TODO 加深了解一下进制转换
public class lq_7936_数位和相等 {
    static int two(int t){
        int s1=0;
        while(t!=0){
            s1 +=(t%2);
            t/=2;
        }
        return s1;
    }

    static int eight(int e){
        int s2=0;
        while(e!=0){
            s2+=(e%8);
            e/=8;
        }
        return s2;
    }
    public static void main(String[] args) {
        int i=1;
        int ans=0;
        for(;;i++)
        {
            if(two(i)==eight(i)) ans++;
            if(ans==23) break;
        }
        System.out.println(i);
    }
}
