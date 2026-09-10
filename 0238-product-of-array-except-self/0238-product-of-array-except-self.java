class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Prefix product
        int prefix = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // Suffix product
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] answer = new int[n];

//         for (int i = 0; i < n; i++) {
//             int product = 1;

//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     product *= nums[j];
//                 }
//             }

//             answer[i] = product;
//         }

//         return answer;
//     }
// }