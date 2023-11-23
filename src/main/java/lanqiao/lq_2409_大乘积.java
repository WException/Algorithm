package lanqiao;

public class lq_2409_大乘积 {
    public static void main(String[] args) {
        int[] nums = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77};
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i] * nums[j] >= 2022){
                        count++;
                    }
                }
            }
        }
        //不要忘记结果除2
        System.out.println(count/2);
    }
}
