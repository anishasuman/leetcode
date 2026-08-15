class Solution {
    public int maxSubArray(int[] nums) {
        int CS = nums[0];
        int maxSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            CS = Math.max(nums[i], CS + nums[i]);
            maxSum = Math.max(maxSum , CS); 
        }
        return maxSum;
    }
}