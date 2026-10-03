class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int start = matrix[0][0];
        int end = matrix[matrix.length-1][matrix[0].length-1];
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
}