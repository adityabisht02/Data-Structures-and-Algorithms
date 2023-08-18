class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0,high=0,count=0;
        while(high<s.length()){
            if(!map.containsKey(s.charAt(high))){
                map.put(s.charAt(high),high);
                high++;
            }
            else{
                if(high-low>count){
                    count=high-low;
                }
                int index=map.get(s.charAt(high));
                while(low<=index){
                    map.remove(s.charAt(low));
                    low++;
                }
                map.put(s.charAt(high),high);
                high++;
            }
        }
        if(high-low>count){
            count=high-low;
        }
        return count;
    }
}