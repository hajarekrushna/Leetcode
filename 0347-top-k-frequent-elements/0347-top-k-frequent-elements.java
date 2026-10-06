class Solution {
    class Pair{
        int first;
        int second;
        Pair(int f,int s){
            first = f;
            second = s;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> {
                if(a.first != b.first)
                    return a.first-b.first;
                return 0;    
            }
        ); 
        int []arr = new int[k];
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            pq.add(new Pair(entry.getValue(),entry.getKey()));
            if(pq.size() > k){
                pq.poll();
            }
        }
        for(int i = 0; i < k; i++){
            arr[i] = pq.poll().second;
        }
        return arr;
    }
}