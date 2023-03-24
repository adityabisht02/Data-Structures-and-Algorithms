class Solution {
    public int calcSumOfSquares(int n){
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp*temp;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        //create hashmap to keep track of loop
        HashSet<Integer> set=new HashSet();
        
        while(n!=1){
            set.add(n);
            n=calcSumOfSquares(n);
            //if it loops back without reaching 1
            if(set.contains(n)){
                return false;
            }            
        }
        
        return true;
    }
}