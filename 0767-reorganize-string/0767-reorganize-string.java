class Solution {
    class Pair{
        int first;
        char second;
        Pair(int f ,char s){
            first = f;
            second =s;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n ; i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> { 
                if(a.first != b.first)
                    return b.first - a.first;
                return 0;
            }
        );
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            pq.add(new Pair(entry.getValue(),entry.getKey()));
        }
        int last = 0;
        StringBuilder ans = new StringBuilder();
        while(last < n){
            if(ans.length() == 0){
                ans.append(pq.peek().second);
                if(pq.peek().first > 1) pq.add(new Pair(pq.peek().first-1,pq.poll().second));
                else pq.poll();
                last++;
            }
            else if(ans.charAt(last-1) != pq.peek().second){
                ans.append(pq.peek().second);
                if(pq.peek().first > 1) pq.add(new Pair(pq.peek().first-1,pq.poll().second));
                else pq.poll();
                last++;
            }else{
                Pair p = pq.poll();
                if(pq.isEmpty()){
                    return "";
                }
                ans.append(pq.peek().second);
                if(pq.peek().first > 1) pq.add(new Pair(pq.peek().first-1,pq.poll().second));
                else pq.poll();
                pq.add(p);
                last++;
            }
        }
        return ans.toString();
    }
}