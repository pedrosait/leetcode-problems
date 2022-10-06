public class Solution {
    // solution array
    int[] sumArray = new int[2];
    
    public int[] TwoSum(int[] nums, int target) {
        // iterate nums array with two loop for
        for(int i = 0; i <= nums.Length - 1; i++) {
            for(int j = 0; j <= nums.Length - 1; j++) {
                // check if the position is not the same 
                // and if the sum of the values ​​of the array position 
                // are equal to the target number
                if(i != j && (nums[i] + nums[j]) == target) {
                    // return the positons
                    return new int[2] { i, j};
                }
            }
        }
        // if there is no sum equal return 0, 0
        sumArray = new int[1] { 0 };
		return sumArray;
    }
}