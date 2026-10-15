class Solution {
    class Pair{
        int first;
        int second;
        Pair(int f, int s){
            first = f;
            second = s;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> {
                if(a.first != b.first) 
                    return a.first - b.first;
                return b.second - a.second;    
            }
        );
        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            pq.add(new Pair(entry.getValue(),entry.getKey()));
        }
        int i = 0;
        while(!pq.isEmpty()){
            int num = pq.peek().second;
            int count = pq.poll().first;
            while(count > 0){
                nums[i++] = num;
                count--;
            }
        }
        return nums;
    }
}