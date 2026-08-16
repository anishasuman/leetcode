class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cs = nums[0], ms = nums[0], cmin = nums[0], min = nums[0], total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);// Maximum Kadane
            ms = Math.max(ms, cs);
            cmin = Math.min(nums[i], cmin + nums[i]);//min
            min = Math.min(min, cmin);
            total += nums[i];
        }
        if (ms < 0)return ms; // All elements negative
        int circular = total - min;   // Circular maximum
        return Math.max(ms, circular);
    }
}