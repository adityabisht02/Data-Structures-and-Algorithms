class Solution {
    public String longestCommonPrefix(String[] strs) {
        //outer loop to check different characters 
        //inner loop to traverse the array and match characters
        String ans="";
        
        for(int i=0;i<strs[0].length();i++){
            
            char temp=strs[0].charAt(i);
            
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()<=i){
                    return ans;
                }
                if(strs[j].charAt(i)!=temp){
                    return ans;
                }
            }
            ans+=temp;
        }
        
        return ans;
    }
}