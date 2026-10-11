class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= rowIndex;i++){
            ans.add(new ArrayList<>());
            ans.get(i).add(1);
            for(int j = 1; j < i; j++){
                ans.get(i).add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            if(i == 0)continue;
            ans.get(i).add(1);
        }
        return ans.get(rowIndex);
    }
}