class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i] >= i && sum(nums[i],0) == i){
                return i;
            }
        }
        return -1;
    }

    public int sum (int n, int sum){
        if(n == 0) return sum;
        sum += n%10;
        return (sum(n/10,sum));
    }
}