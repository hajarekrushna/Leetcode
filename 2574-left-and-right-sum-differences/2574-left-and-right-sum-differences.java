class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix = 0;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
        }
        for(int i = 0; i < nums.length ;i++){
            int ans = Math.abs(prefix - (sum - nums[i] - prefix));
            prefix += nums[i];
            nums[i] = ans;
        }
        return nums; 
    }
}