class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[128];
        
        //count occurences
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        
        //oddcount stores 
        boolean isOddCharacterPresent=false;
        
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            //if there is an odd occuring letter add the even part to sum
            if(arr[i]%2!=0){
                isOddCharacterPresent=true;
                sum+=arr[i]-1;
            }
            else{
                sum+=arr[i];
            }
            
        }
        
        //there can be only 1 odd character
        if(isOddCharacterPresent){
            return sum+1;
        }
        
        return sum;
    }
}