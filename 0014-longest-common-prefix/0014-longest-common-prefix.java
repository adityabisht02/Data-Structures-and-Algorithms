class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index=0;
        int size=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<size){
                size=strs[i].length();
            }
        }
        String str="";
        while(index<size){
            char temp=strs[0].charAt(index);
            
            for(int i=0;i<strs.length;i++){
                if(strs[i].charAt(index)!=temp){
                    return str;
                }
            }
            str=str+temp;
            index++;
        }
        
        return str;
    }
}