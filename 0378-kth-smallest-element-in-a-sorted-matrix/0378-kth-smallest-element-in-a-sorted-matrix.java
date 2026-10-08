/*class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int start = matrix[0][0];
        int end = matrix[matrix.length-1][matrix[0].length-1];   // binary search;
        while(start < end){
            int mid = start + (end -start)/2;
            int result = small(matrix,mid);
            
            if(result < k) start = mid + 1;
            else end = mid;
        }
        return start;
        
    }
    public int small(int[][] matrix, int num){
        int count = 0;
        int row = matrix.length - 1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] <= num){
                count += row + 1;
                col++;
            }else row--;
        }
        return count;
    }
}*/

class Solution {
    class Pair{
        int num;
        int i;
        int j;
        Pair(int start,int a, int b){
            num = start;
            i = a;
            j = b; 
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> {
                if(a.num != b.num)
                    return a.num - b.num;
                return 0;
            }
        );
        for(int i = 0; i < matrix.length; i++){
            pq.add(new Pair(matrix[i][0],i,0));
        }
        for(int i = 0; i < k-1 ; i++){
            int row = pq.peek().i;
            int col = pq.peek().j;
            pq.poll();
            if(col < matrix[0].length - 1)
            pq.add(new Pair(matrix[row][col+1],row,col+1));
        }
        return pq.poll().num;
    }
}