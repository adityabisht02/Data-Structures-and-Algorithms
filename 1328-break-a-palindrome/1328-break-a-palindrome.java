class Solution {
    public boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        
        String ans="";
        boolean isReplaced=false;
        
        for(int i=0;i<palindrome.length();i++){
            if(palindrome.charAt(i)!='a' && !isReplaced){
                ans+='a';
                isReplaced=true;
            }
            else{
                ans+=palindrome.charAt(i);
            }
        }
        
        //if not replaced
        if(!isReplaced){
            ans=ans.substring(0,ans.length()-1);
            ans+='b';
        }
        else if(isPalindrome(ans)){
            palindrome=palindrome.substring(0,palindrome.length()-1);
            palindrome+='b';
            return palindrome;
        }
        
        return ans;
    }
}