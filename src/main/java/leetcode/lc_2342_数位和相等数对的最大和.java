package leetcode;

public class lc_2342_数位和相等数对的最大和 {
    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{18,43,36,13,7}));
    }

    public static int maximumSum(int[] nums) {
        //找出每个数位和
        int[][] value = new int[100][2];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            int sum = 0;
            while (tmp >= 10){
                sum+=tmp%10;
                tmp/=10;
            }
            sum+=tmp%10;
//            if (value[sum][0] == 0 && value[sum][1] == 0){
//                value[sum][0]=nums[i];
//            }
//            if (nums[i] > value[sum][0]) {
//                value[sum][0]=nums[i];
//            } else if (nums[i] > value[sum][1]) {
//                value[sum][1]=nums[i];
//            }
            if (nums[i] >= value[sum][0]) { // 最大沦为次大, 更新最大
                value[sum][1] = value[sum][0];
                value[sum][0] = nums[i];
            } else if (nums[i] > value[sum][1]) { // 更新次大
                value[sum][1] = nums[i];
            }
            // 由范围可知数位和范围1~81
            // value[n][0]代表数位和为n的最大值
            // value[n][1]代表数位和为n的次大值
        }
        int result = -1;
        for (int i = 0; i < 100; i++) {
            if (value[i][0] != 0 && value[i][1] != 0){
                result = value[i][0]+value[i][1];
                break;
            }
        }

        for (int i = 0; i < 100; i++) {
//            System.out.println(value[i][0]+value[i][1]+" : "+i);
            if (value[i][0] != 0 && value[i][1] != 0){
                if (value[i][0]+value[i][1] > result) result = value[i][0]+value[i][1];
            }
        }
        return result;
    }
}

//TODO 查看别人的写法
class Solution {
    public int maximumSum(int[] nums) {
        int[][] val = new int[100][2];
        for (int x : nums) {
            int t = x, cur = 0;
            while (t != 0) {
                cur += t % 10;
                t /= 10;
            }
            if (x >= val[cur][1]) { // 最大沦为次大, 更新最大
                val[cur][0] = val[cur][1];
                val[cur][1] = x;
            } else if (x > val[cur][0]) { // 更新次大
                val[cur][0] = x;
            }
        }
        int ans = -1;
        for (int i = 0; i < 100; i++) {
            if (val[i][0] != 0 && val[i][1] != 0){
                ans = Math.max(ans, val[i][0] + val[i][1]);
            }
        }
        return ans;
    }
}