import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }
}
// Time  = O(n)
// Space = O(n)

// 1️⃣ Brute Force
// for (int i = 0; i < nums.length; i++) {
//     for (int j = i + 1; j < nums.length; j++) {
//         if (nums[i] == nums[j]) {
//             return nums[i];
//         }
//     }
// }
// Time  = O(n²)
// Space = O(1)

// 2️⃣ Sorting
// Arrays.sort(nums);

// for (int i = 1; i < nums.length; i++) {
//     if (nums[i] == nums[i - 1]) {
//         return nums[i];
//     }
// }

// return -1;
// Time  = O(n log n)
// Space = O(1)* 

// 3️⃣ HashSet
// HashSet<Integer> set = new HashSet<>();

// for (int num : nums) {
//     if (set.contains(num)) {
//         return num;
//     }

//     set.add(num);
// }

// return -1;
// Time  = O(n)
// Space = O(n)