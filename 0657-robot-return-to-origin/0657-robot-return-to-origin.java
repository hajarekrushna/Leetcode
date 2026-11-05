class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0;
        int hor = 0;
        int n = moves.length();
        for(int i = 0; i < n; i++){
            char ch = moves.charAt(i);
            if(ch == 'U') ver++;
            else if(ch == 'D') ver--;
            else if(ch == 'L') hor--;
            else hor++;
        }
        return ver == 0 && hor == 0;
    }
}