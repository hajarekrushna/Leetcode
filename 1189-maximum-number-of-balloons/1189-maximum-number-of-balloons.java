class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap <Character,Integer> freq = new HashMap<>();
        String s = "balon";
        int [] arr = {1,1,2,2,1};
        int n = text.length();
        int min = Integer.MAX_VALUE;;
        for(int i = 0; i < n; i++){
            freq.put(text.charAt(i),freq.getOrDefault(text.charAt(i),0)+1);
        }
        for(int i = 0; i < 5; i++){
            if(freq.containsKey(s.charAt(i))){
                min = Math.min(min,freq.get(s.charAt(i))/arr[i]);
            }else{
                return 0;
            }
        }
        if(min == Integer.MAX_VALUE)return 0;
        else return min;
    }
}