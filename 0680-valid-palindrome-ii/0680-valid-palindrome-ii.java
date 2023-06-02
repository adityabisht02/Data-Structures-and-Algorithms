class Solution {
    boolean isDeletePerformed=false;
    public boolean check(String s,int i,int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            //if chars equal then no issues and check all chars after
            return check(s,i+1,j-1);
        }
        //else if chars unequal do one deletion using i and one using j and check if either are working
        if(isDeletePerformed){
            //if deletion already done
            return false;
        }
        isDeletePerformed=true;
        return (check(s,i+1,j) || check(s,i,j-1));
    }
    
    public boolean validPalindrome(String s) {
        //receusively check both,if unequal chars, remove either and call recursion 
        
        return check(s,0,s.length()-1);
        
    }
}