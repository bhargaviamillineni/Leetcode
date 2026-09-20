class Solution {
    public int reverseDegree(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int sum = 0;
        for(int i=0; i<n; i++){
            int val = s.charAt(i) - 'a';
            sum += (i+1) *(26-val);
        }
        return sum;
    }
}