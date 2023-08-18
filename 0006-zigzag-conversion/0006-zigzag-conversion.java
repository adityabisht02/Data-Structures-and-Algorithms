class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int row=0;
        boolean isDown=true;
        String ans="";
        for(int j=0;j<numRows;j++){
             isDown=true;
           row=0; 
        for(int i=0;i<s.length();i++){
            if(row==j){
                ans=ans+s.charAt(i);
                
            }
            if(isDown){
                if(row==numRows-1){
                    row--;
                    isDown=false;
                }
                else{
                    row++;
                }                
            }
            else{
                if(row==0){
                   row++;
                    isDown=true;
                }
                else{
                    row--;
                }
                
            }
            
        }
        }
        
        return ans;
       
    }
}