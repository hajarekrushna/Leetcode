class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0; i < nums.length; i++){
            if(!freq.containsKey(nums[i])) continue;
            int pair = k - nums[i];
            if(!freq.containsKey(pair)) continue;

            if(freq.get(nums[i]) == 1) freq.remove(nums[i]);
            else freq.put(nums[i],freq.get(nums[i]) - 1);
            if(freq.containsKey(pair)){
                if(freq.get(pair) == 1) freq.remove(pair);
                else freq.put(pair,freq.get(pair) - 1);
            }else continue;
            count++;
        }
        return count;
    }
}