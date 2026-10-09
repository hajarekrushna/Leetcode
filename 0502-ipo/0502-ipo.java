class Solution {
    class Pair{
        int first;
        int second;
        Pair(int f, int s){
            first = f;
            second = s;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int [][] arr = new int[profits.length][2];
        for(int i = 0 ; i < arr.length; i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.second != b.second) 
                    return b.second - a.second;
                return a.first - b.first;
            }
        );
        int count = 0;
        for(int i = 0; i < k; i++){
            while(count < arr.length && w >= arr[count][0]){
                pq.add(new Pair(arr[count][0],arr[count][1]));
                count++;
            }
            if(pq.isEmpty()) break;
            w += pq.poll().second;
        }
        return w;
    }
}