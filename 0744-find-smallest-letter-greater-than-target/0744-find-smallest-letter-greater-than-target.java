class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(int i=0;i<letters.length;i++){
            //use ascii values to find lexicographic 
            if(letters[i]-target>0){
                return letters[i];
            }
        }
        return letters[0];
    }
}