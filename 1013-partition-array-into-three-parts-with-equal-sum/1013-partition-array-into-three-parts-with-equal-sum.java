class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0 ;
        for(int i = 0; i < arr.length ;i++){
            sum += arr[i];
            map.put(sum,i);
        }
        if(sum % 3 != 0) return false; 
         int target = sum / 3;
        int prefix = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];

            if(prefix == target){
                count++;
                if(count == 2 && i < arr.length-1) return true;
                prefix = 0;
            }
        }
        return false;
    }
}