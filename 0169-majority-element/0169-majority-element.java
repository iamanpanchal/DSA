// 3. Boyer-Moore Voting Algorithm (Optimal)
// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0];
//         int count = 0;
//         for(int i=0; i<nums.length; i++){
//             if(count == 0){
//                 candidate = nums[i];
//             }
//             if(nums[i] == candidate){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//         }
//     return candidate;

//     }
// }

// 1. Brute Force Approach (O(n²))
class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}

// 2. HashMap Approach (O(n))

// import java.util.HashMap;

// class Solution {
//     public int majorityElement(int[] nums) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int num : nums) {

//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if (map.get(num) > nums.length / 2) {
//                 return num;
//             }
//         }

//         return -1;
//     }
// }