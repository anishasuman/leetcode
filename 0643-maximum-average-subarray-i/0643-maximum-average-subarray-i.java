// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int c = 0;
//         for(int i = 0;i<k;i++){
//             c += nums[i];
//         }
//         int n = nums.length;
//         int max = c;
//         for(int i=1;i<n-k+1;i++){
//             c = c-nums[i-1]+nums[i+k-1];
//             if(c>max){
//                 max = c;
//             }
//         }
//         return (double) max/k;
//     }
// }

// class Solution {
//    public double findMaxAverage(int[] nums, int k) {
//         int  sum = 0;
//         for(int i=0;i<k;i++){
//             sum+=nums[i];
//         }
//         int max = sum;
//         //in slidwindow never start loop from 0 
//         for(int i=k;i<nums.length;i++){
//             //formula to remove 1 element and add 1 element
//             sum = sum - nums[i-k] + nums[i] ;
//             max = Math.max(max,sum);
//         }
//         //avg calculate kro
//         return (double) max/k;
//    }
// }

class Solution {
    public double findMaxAverage(int[] nums, int k){
        long Sum = 0;
        for(int i=0;i<k;i++)Sum+=nums[i];
        long maxSum = Sum;
        for(int r = k;r<nums.length;r++){
            Sum -= nums[r-k];
            Sum += nums[r];
            maxSum = Math.max(maxSum , Sum); 
        }
        return (double) maxSum / k;
    }
}








































