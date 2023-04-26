class Solution {
    public String largestOddNumber(String num) {
        //go backwards and if u find odd return substring(0,i+1) as answer
        
        for(int i=num.length()-1;i>=0;i--){
            int temp=num.charAt(i)-'0';
            //if digit odd
            if(temp%2!=0){
                return num.substring(0,i+1);
            }
        }
        
        return "";
    }
}