class Solution {
    public boolean checkPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isPalindrome(String s) {
        String str="";
        
        //traverse the string
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
               str= str+Character.toLowerCase(s.charAt(i));
            }
        }
        
        System.out.println(str);
        
        return checkPalindrome(str);
    }
}