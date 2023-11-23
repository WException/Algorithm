package leetcode;

public class lc_100122_区分黑球与白球 {
    public static void main(String[] args) {
        System.out.println(minimumSteps("1101"));
    }

    public static long minimumSteps(String s) {
//        思路类似冒泡排序，毕竟这题就是把 sss 排序。
//对于每个 0，它左边有多少个 1，就移动多少次。
//所以一边遍历 sss，一边统计1的个数
        long ans = 0;
        int cnt1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                cnt1++;
            } else {
                ans += cnt1;
            }
        }
        return ans;
//        //从右往左找，是黑球就进一位 不是黑球就找前面最近的黑球 放到此处。如果前面没黑球，就返回结果
//        long result = 0;
//        for(int i=s.length()-1;i>0;i--){
//            if(s.charAt(i) != '1'){
//                //找前面的黑球
//                int tmp = i;
//                while(s.charAt(tmp) == '1'){
//                    tmp-=1;
//                }
//                tmp-=1;
////                System.out.println("tmp="+tmp+" i="+i);
//                result += i-tmp;
//            }
//        }
//        return result;
    }
}
