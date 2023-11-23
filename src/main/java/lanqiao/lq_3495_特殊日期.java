package lanqiao;

public class lq_3495_特殊日期 {
    public static void main(String[] args) {
        int result = 0;
        for(int y=2000;y<2000000;y++){
            for(int m=1;m<=12;m++){
                if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                    for(int d=1;d<=31;d++){
                        if(y%m==0 && y%d==0){
                            result+=1;
                        }
                    }
                }
                else if(m==4 || m==6 || m==9 || m==11) {
                    for(int d=1;d<=30;d++){
                        if(y%m==0 && y%d==0){
                            result+=1;
                        }
                    }
                }
                else{
                    //闰年2月29天，否则28天
                    if(y%400 == 0 || y % 4 == 0 && y % 100 != 0){
                        for(int d=1;d<=29;d++){
                            if(y%m==0 && y%d==0){
                                result+=1;
                            }
                        }
                    } else {
                        for(int d=1;d<=28;d++){
                            if(y%m==0 && y%d==0){
                                result+=1;
                            }
                        }
                    }
                }
            }
        }
        result++;
        System.out.println(result);
    }
}
class main {
    static int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static boolean isLeap(int y) {
        return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
    }

    public static int daysOfMonth(int y, int m) {
        if (m == 2) {
            return isLeap(y) ? 29 : 28;
        }
        return days[m];
    }

    public static void main(String[] args) {
        int res = 0;
        for (int i = 2000; i < 2000000; ++i) {
            for (int j = 1; j <= 12; ++j) {
                for (int k = 1; k <= daysOfMonth(i, j); ++k) {
                    res += i % j == 0 && i % k == 0 ? 1 : 0;
                }
            }
        }
        res++;

        System.out.println(res);
    }
}