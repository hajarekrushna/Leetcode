class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> ch = new Stack<>(); 
        Stack<Integer> freq = new Stack<>();
        int n = s.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            if(!ch.isEmpty() && ch.peek()== s.charAt(i)){
                if(freq.peek() == k-1){
                    ch.pop();
                    freq.pop();
                }else{
                    freq.push(freq.pop() + 1);
                }
            }else{
                ch.push(s.charAt(i));
                freq.push(1);
            }
        }
        while(!ch.isEmpty()){
            for(int i = 0 ; i < freq.peek(); i++){
                ans = ch.peek() + ans;
            }
            ch.pop();
            freq.pop(); 
        }
        return ans;
    }
}