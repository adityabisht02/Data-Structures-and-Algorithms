class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        int minlength=Integer.MAX_VALUE,index=0,flag;
        
        //first find smallest string
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minlength){
                minlength=strs[i].length();
            }
        }
        
        while(index<minlength){
            char temp=strs[0].charAt(index);
            for(int i=0;i<strs.length;i++){
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