class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 1)return true;
        int i = 0;
        while( i < nums.length-2 && nums[i] == nums[i+1]) i++;
        if(nums[i] < nums[i+1]){
            for(int j = i+1; j < nums.length-1; j++){
                if(nums[j] > nums[j+1])return false;
            }
        }else{
            for(int j = i+1; j < nums.length-1; j++){
                if(nums[j] < nums[j+1])return false;
            }
        }
        return true;
    }
}