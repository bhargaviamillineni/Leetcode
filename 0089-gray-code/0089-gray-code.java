class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for(int bit = 0; bit < n; bit++){
            int size =ans.size();
            for(int i=size-1; i>=0; i--){
                ans.add(ans.get(i)|(1 << bit));
            }
        }
        return ans;
    }
}