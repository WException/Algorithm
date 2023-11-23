package leetcode;

public class lc_2760_最长奇偶子数组 {
    public static void main(String[] args) {

    }
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0, n = nums.length;
        // 两重for循环，列举所有子串
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (isSatisfied(nums, l, r, threshold)) {
                    res = Math.max(res, r - l + 1);
                }
            }
        }
        return res;
    }
    public static boolean isSatisfied(int[] nums, int l, int r, int threshold) {
        if (nums[l] % 2 != 0) {
            return false;
        }
        for (int i = l; i <= r; i++) {
            if (nums[i] > threshold || (i < r && nums[i] % 2 == nums[i + 1] % 2)) {
                return false;
            }
        }
        return true;
    }
}