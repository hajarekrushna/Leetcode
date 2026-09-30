class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];
        for(int i = 1; i < piles.length; i++){
            end = Math.max(end,piles[i]);
        }
        int ans = end;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(hour(piles,mid) > h){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public long hour(int[] piles,int speed){
        long hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += piles[i]/speed;
            if(piles[i]%speed != 0) hours++; 
        }
        return hours;
    } 
}