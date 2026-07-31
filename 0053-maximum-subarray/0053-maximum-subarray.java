class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum = 0;
        int max_sum = nums[0];

        for(int i=0; i<nums.length; i++){
            current_sum = current_sum + nums[i];
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
            if(current_sum < 0){
                current_sum = 0;
            }
        }
        return max_sum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {

//         int currentSum = 0;
//         int maxSum = nums[0];

//         for (int num : nums) {

//             currentSum += num;

//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }

//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }

//         return maxSum;
//     }
// }