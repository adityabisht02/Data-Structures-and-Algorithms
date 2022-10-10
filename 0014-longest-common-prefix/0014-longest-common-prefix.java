class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index=0,i;
        int size=Integer.MAX_VALUE;
        String prefix="";
        
        //first find smallest string in array
        for(i=0;i<strs.length;i++){
            if(strs[i].length()<size){
                size=strs[i].length();
            }
        }
        
        while(index<size){
            //for every index check the character at that index
            char temp=strs[0].charAt(index);
            
            for(i=0;i<strs.length;i++){
                if(strs[i].charAt(index)!=temp){
                    return prefix;
                }
            }
            prefix+=temp;
            index++;
        }
        
        return prefix;
        
    }
}