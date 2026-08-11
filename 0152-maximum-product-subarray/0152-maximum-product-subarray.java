class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];//for negative term
        int max = nums[0];//for +ve
        int ans = nums[0];
        int n = nums.length;
        for(int i = 1; i < n ; i++){
            int prev_min = min; // dont use direct min and max for cal new min and max it overwrite min
            int prev_max = max; 
            min = Math.min(nums[i],Math.min(nums[i]*prev_min,nums[i]*prev_max));
            max = Math.max(nums[i],Math.max(nums[i]*prev_min,nums[i]*prev_max));
            ans = Math.max(ans,max);
        }
        return ans;
    }
}