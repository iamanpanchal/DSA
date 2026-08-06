class Solution {
    public int heightChecker(int[] heights) {

        // Step 1: Copy the original array
        int[] original = heights.clone();

        // Step 2: Sort heights using Selection Sort
        for (int i = 0; i < heights.length; i++) {

            for (int j = i + 1; j < heights.length; j++) {

                if (heights[i] > heights[j]) {

                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }

        // Step 3: Compare original and sorted array
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (original[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}

// ✅ Time Complexity = O(n)
// Space Complexity = O(1)


// class Solution {
//     public int heightChecker(int[] heights) {

//         int[] count = new int[101];

//         // Count frequency
//         for (int h : heights) {
//             count[h]++;
//         }

//         int index = 0;
//         int ans = 0;

//         // Compare with expected order
//         for (int h = 1; h <= 100; h++) {

//             while (count[h] > 0) {

//                 if (heights[index] != h) {
//                     ans++;
//                 }

//                 index++;
//                 count[h]--;
//             }
//         }

//         return ans;
//     }
// }