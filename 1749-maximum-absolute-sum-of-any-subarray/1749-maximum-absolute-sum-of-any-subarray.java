class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int csx = nums[0], csn = nums[0], ms = nums[0], mins = nums[0];
        for(int i = 1; i < nums.length; i++) {
            csx = Math.max(nums[i], csx + nums[i]);
            ms = Math.max(ms, csx);
            csn = Math.min(nums[i], csn + nums[i]);
            mins = Math.min(mins, csn);
        }
        return Math.max(ms, Math.abs(mins));
    }
}