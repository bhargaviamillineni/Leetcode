class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character , Integer> set = new HashMap<>();
        for(char ch : s.toCharArray()){
            set.put(ch, set.getOrDefault(ch , 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            if(!set.containsKey(t.charAt(i)) || set.get(t.charAt(i)) == 0) return t.charAt(i);
            set.put(t.charAt(i) , set.get(t.charAt(i)) -1);
        }
        return ' ';
    }
}