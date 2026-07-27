import java.util.Arrays;

class Solution {

    public int missingNumber(int[] nums) {

        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        int actualsum = (nums.length*(nums.length+1)/2);
        int missingvalue = actualsum - sum;

        return missingvalue; 


    //     Arrays.sort(nums);

    //     for (int i = 0; i < nums.length; i++) {

    //         if (nums[i] != i) {
    //             return i;
    //         }
    //     }

    //     return nums.length;
    }
}