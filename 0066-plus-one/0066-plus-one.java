class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length-1; i >= 0; i--){
            int sum = digits[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0)list.add(carry);
        int [] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[ans.length-i-1] = list.get(i);
        }
        return ans;
    }
}