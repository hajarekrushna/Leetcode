class Solution {
    String s = "";
    ArrayList<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n,n);
        return list;
    }
    public void generate(int open, int close){
        if(open == 0 && close == 0){
            list.add(s);
            return;
        }
        if(open > 0){
            s += '(';
            generate(open-1, close);
            s = s.substring(0,s.length()-1);
        }
        if(close > open){
            s += ')';
            generate(open, close-1);
            s = s.substring(0,s.length()-1);
        }
    return;
    }
}