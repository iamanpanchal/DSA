class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
// Time  = O(n)
// Space = O(1)


// Brute Force
// class Solution {
//     public int removeElement(int[] nums, int val) {

//         int n = nums.length;
//         int i = 0;

//         while (i < n) {

//             if (nums[i] == val) {

//                 for (int j = i; j < n - 1; j++) {
//                     nums[j] = nums[j + 1];
//                 }

//                 n--;
//             } else {
//                 i++;
//             }
//         }

//         return n;
//     }
// }
// // Time  = O(n²) worst case
// // Space = O(1)

// Extra Array
// class Solution {
//     public int removeElement(int[] nums, int val) {

//         int[] temp = new int[nums.length];
//         int k = 0;

//         for (int i = 0; i < nums.length; i++) {

//             if (nums[i] != val) {
//                 temp[k] = nums[i];
//                 k++;
//             }
//         }

//         for (int i = 0; i < k; i++) {
//             nums[i] = temp[i];
//         }

//         return k;
//     }
// }
// Time  = O(n)
// Space = O(n)