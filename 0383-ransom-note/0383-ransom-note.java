class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int n = ransomNote.length();
        int m = magazine.length();
        if(n > m) return false;
        for(int i = 0; i < m; i++){
            freq.put(magazine.charAt(i),freq.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i = 0; i < n; i++){
            if(freq.containsKey(ransomNote.charAt(i)) && freq.get(ransomNote.charAt(i)) > 0){
                freq.put(ransomNote.charAt(i),freq.get(ransomNote.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}