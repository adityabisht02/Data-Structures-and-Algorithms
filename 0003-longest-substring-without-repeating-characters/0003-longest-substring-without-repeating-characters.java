class Solution {
    public int lengthOfLongestSubstring(String s) {
        //map of char and index
        HashMap<Character,Integer> map=new HashMap<>();
    
        int low=0,high=0;
        int ans=0;
        
        while(high<s.length()){
            if(!map.containsKey(s.charAt(high))){
                map.put(s.charAt(high),high);
            }
            else{
               
                int index=map.get(s.charAt(high));
                if(high-low>ans){
                    ans=high-low; 
                }
               
                while(low<=index){
                    
                    map.remove(s.charAt(low));
                    low++;
                }
                map.put(s.charAt(high),high);
            }
            high++;
        }
        if(high-low>ans){
            ans=high-low;
        }
        return ans;
    }
}