class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cs = nums[0];
        int ms = nums[0];
        int cmin = nums[0];
        int min = nums[0];
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Maximum Kadane
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);

            // Minimum Kadane
            cmin = Math.min(nums[i], cmin + nums[i]);
            min = Math.min(min, cmin);

            total += nums[i];
        }

        // All elements negative
        if (ms < 0) {
            return ms;
        }

        // Circular maximum
        int circular = total - min;

        return Math.max(ms, circular);
    }
}