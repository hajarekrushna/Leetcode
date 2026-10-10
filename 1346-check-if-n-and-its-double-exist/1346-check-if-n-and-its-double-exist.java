class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(find(arr,arr[i]*2,i)) return true;
        }
        return false;
    }
    public boolean find(int[] arr, int target,int i){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == i){
                if(arr[i] < 0) end = mid - 1;
                else start = mid + 1;
                continue;
            }
            if(target > arr[mid]) start = mid + 1;
            else if(target < arr[mid]) end = mid -1;
            else return true;       
        }
        return false;
    }
}