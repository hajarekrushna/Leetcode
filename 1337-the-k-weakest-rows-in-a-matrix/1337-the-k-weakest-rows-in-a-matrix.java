class Solution {
    class Pair{
        int sum;
        int index;
        Pair(int s ,int i){
            sum = s;
            index = i;
        }
    }
    public int sum(int [][]mat, int i){
        int sum = 0;
        for(int j = 0; j < mat[0].length; j++){
            sum += mat[i][j];
        }
        return sum;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> {
                if(a.sum != b.sum)
                    return b.sum - a.sum;
                return b.index - a.index; 
            }
        );
        for(int i = 0; i < k; i++){
            pq.add(new Pair(sum(mat,i),i));
        }
        for(int i = k; i < mat.length; i++){
            int power = sum(mat,i);
            if(pq.peek().sum > power){
                pq.poll();
                pq.add(new Pair(power,i));
            }
        }
        for(int i = k-1; i>=0; i--){
            ans[i] = pq.poll().index;
        }
        return ans;
    }
}