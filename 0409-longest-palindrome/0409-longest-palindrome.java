class Solution {
    public int longestPalindrome(String s) {
        int []arr = new int[52];
        boolean odd = false;
        int even = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) > 'Z'){arr[s.charAt(i) - 'a']++;
            }else{
                arr[s.charAt(i) - 'A' + 26]++;
            }
        }
        for(int i = 0; i < 52; i++){
            if(arr[i]%2 == 0){
                even += arr[i];
            }else{
                odd = true;
                even += arr[i]-1;
            } 
        }
        if(odd) return even + 1;
        else return even;
    }
}