package leetcode;

public class lc_2656_k个元素最大和 {
    public static void main(String[] args) {

    }

    private static int maximizeSum(int[] nums, int k){
        // 找出数组最大值
        int max = nums[0];
        for (int num : nums) {
            if (num > max){
                max = num;
            }
        }
        System.out.println("max: "+max);
        // 递增相加k次
        int result = 0;
        for (int i = 0; i < k; i++) {
            result+=max+i;
        }
        return result;
    }
}
