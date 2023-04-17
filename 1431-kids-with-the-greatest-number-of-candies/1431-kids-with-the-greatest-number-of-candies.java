class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //calc max value , then traverse the array add 
        //extracandies and see if greater than or equal to max
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> ans=new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            int temp=candies[i];
            temp+=extraCandies;
            if(temp>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
        
    }
}