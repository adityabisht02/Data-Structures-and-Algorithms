class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split(" +");
        
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i];
            if(i!=0){
                ans=ans+" ";
            }
        }
        return ans;
    }
}