class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map <Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        int low = 0, high = 0, ans = 0;
        while(high < n){
            freq.put(nums[high],freq.getOrDefault(nums[high],0)+1);
            if(freq.get(nums[high]) <= k) ans = Math.max(ans,high-low+1);
            while(freq.get(nums[high]) > k){
                freq.put(nums[low],freq.get(nums[low])-1);
                low++;
            }
            high++;
        }
        return ans;
    }
}