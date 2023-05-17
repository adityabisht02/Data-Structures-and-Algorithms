class Solution {
    public boolean isVowel(char temp){        
        return (temp=='a') || (temp=='e') || (temp=='i') || (temp=='o') || (temp=='u') || (temp=='A') || (temp=='E') || (temp=='I') || (temp=='O') || (temp=='U');
    }
    
    public String reverseVowels(String s) {
        int low=0,high=s.length()-1;
        char arr[]=s.toCharArray();
        
        while(low<high){
            if(isVowel(s.charAt(low))){
                if(isVowel(s.charAt(high))){
                    char temp=arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;
                    low++;
                    high--;
                }      
                else{
                    high--;
                }
            }
            else{
                 if(isVowel(s.charAt(high))){
                    low++;
                }
                else{
                    low++;
                    high--;
                }
            }
            
           
        }
        
        return new String(arr);
    }
}