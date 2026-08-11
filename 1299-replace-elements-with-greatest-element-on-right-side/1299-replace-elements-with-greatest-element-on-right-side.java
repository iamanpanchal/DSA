class Solution {
    public int[] replaceElements(int[] arr) {

        int max = -1; 

        for (int i = arr.length - 1; i >= 0; i--) {

            // Current value ko save karo
            int current = arr[i]; //current = 1

            // Current position par right-side maximum daalo
            arr[i] = max; //max = -1 

            // Maximum update karo
            if (current > max) { // 1 > -1
                max = current;
            }
        }

        return arr;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)