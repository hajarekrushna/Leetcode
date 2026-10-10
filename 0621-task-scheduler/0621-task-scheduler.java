class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int max = 0;
        int maxcount = 0;
        for(int i = 0 ; i < tasks.length; i++){
            int f = freq.getOrDefault(tasks[i],0)+1;
            if(max < f){
                max = f;
                maxcount = 1;
            }else if(max == f){
                maxcount++;
            }
            freq.put(tasks[i],f);
        }
        int ans = (max - 1)*(n + 1) + maxcount;
        return Math.max(ans,tasks.length);
    }
}