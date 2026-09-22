class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length(), i = 0;
        while(i < n){
            if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)== '['){
                stack.push(s.charAt(i));
                i++;
            }
            else{
                if(stack.isEmpty()) return false;
                
            char ch = stack.pop();
            if(s.charAt(i)== ')' && ch == '(' || s.charAt(i)== '}' && ch =='{' || s.charAt(i)== ']' && ch =='['){
                i++;
            }else
            return false;
            }
        }
        if(stack.isEmpty())return true;
        else return false;
    }
}