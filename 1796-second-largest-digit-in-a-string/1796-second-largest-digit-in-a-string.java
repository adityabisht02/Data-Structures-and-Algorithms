class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set=new HashSet();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(!Character.isDigit(temp)){
                continue;
            }
            int t=(int)temp-((int)'0');
            if(!set.contains(t)){
                pq.add(t);
                set.add(t);
            }
        }
        
        pq.poll();
        if(pq.isEmpty()){
            return -1;
        }
        return pq.poll();
    }
}