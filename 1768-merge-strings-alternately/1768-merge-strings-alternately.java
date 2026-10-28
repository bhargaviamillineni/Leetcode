class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String s = new String();
        int i=0; 
        int j =0;
        while(i < n && j < m){
            s += word1.charAt(i);
            i++;
            s += word2.charAt(j);
            j++;
        }
        while(i < n) s += word1.charAt(i++);
        while(j < m) s += word2.charAt(j++);
        return s;
    }
}