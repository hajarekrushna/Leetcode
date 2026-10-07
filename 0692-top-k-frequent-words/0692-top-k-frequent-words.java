class Solution {
    class Pair{
        int first;
        String second;
        Pair(int f,String s){
            first = f;
            second = s;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freq = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            freq.put(words[i],freq.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> {
                if(a.first != b.first) return a.first - b.first;
                return b.second.compareTo(a.second);
            }
        );
        for(Map.Entry<String,Integer> entry : freq.entrySet()){
            pq.add(new Pair(entry.getValue(),entry.getKey()));
            if(pq.size() > k) pq.poll();
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(pq.poll().second);
        }
        Collections.reverse(list);
        return list;
    }
}