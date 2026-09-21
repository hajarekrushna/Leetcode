class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(0-nums[i]))
            max =Math.max(max,Math.abs(nums[i]));
            else freq.put(nums[i],1);
        }
        return max;
    }
}