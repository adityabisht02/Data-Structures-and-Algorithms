class Solution {
    //sliding window technique
    public boolean isVowel(char temp){
        return (temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u');
    }
    
    public int maxVowels(String s, int k) {
        if(k>s.length()){
            return 0;
        }
      int maxvowels=0;
        
        //first create sliding window till k
        int high=0;
        int vowels=0;
        while(high<k){
            if(isVowel(s.charAt(high))){
                vowels++;
            }
            high++;
        }
        if(vowels>maxvowels){
            maxvowels=vowels;
        }
        
        int low=0;
        while(high<s.length()){
            //remove the low index char
            if(isVowel(s.charAt(low))){
                vowels--;
            }
            low++;
          
            if(isVowel(s.charAt(high))){
                vowels++;
            }
            high++;
            
            if(vowels>maxvowels){
                maxvowels=vowels;
            }
        }
        
        return maxvowels;
    }
}