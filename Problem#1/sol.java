class Solution {
    int pos = 0, aux = 0;
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            if( (nums[i] + nums[i + 1]) == target) {
                pos = i;
                aux = i + 1;
                break;
            }
        }
        return new int[]{pos, aux};
    }
} 