class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int delete = 0;
        int size = arr.length;
        int max = arr[0];
        for(int i = 1; i < size; i++){
            delete = Math.max(arr[i]+delete,nodelete);
            nodelete = Math.max(arr[i], arr[i]+nodelete);
            max = Math.max(max,Math.max(delete,nodelete)); 
        }
        return max;
    }
}