package dotcpp;

public class dc_1016_水仙花数判断 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int a = i%10;
            int b = i/10%10;
            int c = i/10/10%10;
            if (i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }
        }
    }
}
