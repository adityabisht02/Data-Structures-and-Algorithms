class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int iterations=s.length();
        for(int i=0;i<iterations;i++){
            //if s equals goal return true
             if(s.equals(goal)){
                     return true;
            }   
            //else shift s by one
            char temp=s.charAt(0);
            s=s.substring(1,s.length());
            s=s+temp;
            
        }
        
        return false;
    }
}