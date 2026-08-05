class Solution {
    public void sortColors(int[] nums) {

        for(int i=0; i<nums.length; i++){

            for(int j=i+1; j<nums.length; j++){

                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return ;
    }
}
// time : O(n²)
// Space : O(1)

// Dutch National Flag Algorithm

// class Solution {
//     public void sortColors(int[] nums) {

//         int zero = 0, one = 0, two = 0;

//         for (int num : nums) {
//             if (num == 0)
//                 zero++;
//             else if (num == 1)
//                 one++;
//             else
//                 two++;
//         }

//         int i = 0;

//         for (int j = 0; j < zero; j++)
//             nums[i++] = 0;

//         for (int j = 0; j < one; j++)
//             nums[i++] = 1;

//         for (int j = 0; j < two; j++)
//             nums[i++] = 2;
//     }
// }

// Time Complexity
// First pass (count): O(n)
// Second pass (rewrite): O(n)