// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int left = 0;
//         int sum = 0;
//         int minLen = Integer.MAX_VALUE;
//         int n = nums.length;
//         for(int right = 0;right<n;right++){
//             sum+=nums[right];
//         while(sum>=target){
//             minLen = Math.min(minLen,right-left+1);
//             sum -= nums[left];
//             left++;
//         }
//     }
// if (minLen == Integer.MAX_VALUE) {
//     return 0;
// }
// return minLen;   
//  }
// }


// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int i = 0; //int low = i ; high = j
//         int sum = 0;
//         int res = Integer.MAX_VALUE;
//         for(int j=0;j<nums.length;j++){
//             sum += nums[j];
//             while(sum>=target){
//                 res = Math.min(res,j-i+1);
//                 sum -= nums[i];
//                 i++;
//             }
//         }
//         if(res == Integer.MAX_VALUE){
//             return 0;
//         }else{
//             return res;
//         }
//     }
// }

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int Sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++){
            Sum += nums[right];
            while(Sum>=target){
                minLen = Math.min(minLen , right-left+1);
                Sum -= nums[left];
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}
















