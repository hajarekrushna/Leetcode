class Solution {
    public int splitArray(int[] nums, int k) {
        int start = nums[0];
        int end = nums[0];
        for(int i = 1; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start < end){
            int mid = start + (end - start)/2;
            if(check(nums,k,mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public boolean check(int[] nums, int k, int checksum){
        int sum = 0;
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= checksum){
                sum += nums[i];
            }else{
                count++;
                sum = nums[i];
                if(count > k) return false;
            }
        }
        return true;
    }
}