class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> s = new Stack<>();
        for(int i = nums.length-1; i >= 0; i--){
            s.push(nums[i]);
        }
        for(int i = nums.length-1; i >= 0; i--){
            while(!s.isEmpty() && s.peek() <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                s.push(nums[i]);
                nums[i] = -1;
            }else{
                int temp = nums[i];
                nums[i] = s.peek();
                s.push(temp);
            }
            
        }
        return nums;
    }
}