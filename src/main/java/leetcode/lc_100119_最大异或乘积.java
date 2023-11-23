package leetcode;
//TODO 理解这题
public class lc_100119_最大异或乘积 {
    public static void main(String[] args) {
//        System.out.println(maximumXorProduct(12,5,4));
//        System.out.println(maximumXorProduct(6,7,5));
        System.out.println(maximumXorProduct(53449611838892L,712958946092406L,6));
    }

    public static int maximumXorProduct(long a, long b, int n) {
        long x = 1;
        for (int i = 0; i < n; i++) {
            x = x*2;
        }
        int reslut = 0;
        for (int i = 0; i < x; i++) {
            int tmp = i;
            reslut = (int) Math.max(((a ^ tmp) * (b ^ tmp)) % 1000000007, reslut);
//            System.out.println(((a ^ tmp) * (b ^ tmp)) % 1000000007);
        }
        return reslut;
    }
}
