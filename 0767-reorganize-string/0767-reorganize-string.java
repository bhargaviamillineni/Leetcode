class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        HashMap<Character , Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()) mp.put(ch , mp.getOrDefault(ch,0)+1);
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> mp.get(b) - mp.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c : mp.keySet()){
            pq.add(c);
        }
        char prev = '#';
        while(!pq.isEmpty()){
            char c = pq.poll();
            sb.append(c);
            mp.put(c, mp.get(c)-1);
            if(prev != '#' && mp.get(prev) > 0) pq.add(prev);
            prev = c;
        }
        if(sb.length() != s.length()) return "";
        return sb.toString();
    }
}