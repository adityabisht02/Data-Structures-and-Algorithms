class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String ans="";
        int p1=0,p2=0;
        
        int index=0;
        
        while(p1<word1.length() && p2<word2.length()){
            if(index%2==0){
              ans=ans+word1.charAt(p1); 
                p1++;
            }else{
                ans=ans+word2.charAt(p2);
                p2++;
            }
            index++;
        }
        while(p1<word1.length()){
            ans=ans+word1.charAt(p1);
            p1++;
        }
        
         while(p2<word2.length()){
            ans=ans+word2.charAt(p2);
            p2++;
        }
        
        return ans;
    }
}