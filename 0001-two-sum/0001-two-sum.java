// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer>map=new HashMap<>();

//         for(int i = 0;i<nums.length;i++){
//             int b = target-nums[i];
//             if(map.containsKey(b)){
//                 return new int[]{map.get(b),i};
//             }

//             map.put(nums[i],i);
//         }
//         return new int[]{};
//     }
// }
// class Solution {
//     public int[] twoSum(int[] nums, int target){
//         HashSet<Integer , Integer> set = new HashSet<>();
//         for(int i = 0;i<nums.length;i++){
//             int b = target - nums[i];
//             if(set.contains(b)){
//                 return new int[]{set.add(b), i};
//             }
//             set.add(nums[i],i);
//         }
//         return new int[]{};
//     }
// }
// class Solution {
//      public int[] twoSum(int[] nums, int target){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int b = target - nums[i];
//             if(map.containsKey(b)){
//                 return new int[]{map.get(b),i};
//             }
//             map.put(nums[i],i);
//         }
//         return new int[]{};
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target){
        //create hashMap
        HashMap<Integer , Integer> map = new HashMap<>();
        //looping
        for(int i=0;i<nums.length;i++){
            int b = target - nums[i];
            if(map.containsKey(b)){
                return new int[]{map.get(b),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}



























