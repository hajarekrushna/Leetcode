class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int max = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                count++;
                max = Math.max(max,count);
            }else if(s.charAt(i) == ')'){
                count--;
            }else{
                continue;
            }
        }
        return max;
    }
}