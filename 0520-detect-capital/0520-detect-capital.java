class Solution {
    public boolean detectCapitalUse(String word) {
        int smallLetterCount=0,capitalLetterCount=0;
        
        for(int i=0;i<word.length();i++){
            //check ascii value to determine whether capital or smallcase
            if(word.charAt(i)-'A'<=25){
                capitalLetterCount++;
            }
            else{
                smallLetterCount++;
            }
        }
        
        if(capitalLetterCount==word.length() || smallLetterCount==word.length()){
            return true;
        }
        //first letter capital condition
        if(capitalLetterCount==1 && word.charAt(0)-'A'<=25){
            return true;
        }
        
        return false;
        
    }
}