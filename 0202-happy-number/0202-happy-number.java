class Solution {
    public int calculateSum(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            sum+=(temp%10)*(temp%10);
            temp/=10;            
        }
       
        return sum;
    }
    public boolean isHappy(int n) {
        
        HashSet<Integer> set=new HashSet();
        
        while(n!=1){
        //if set contains n ,it means we are looping in a cycle without 1
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            
            n=calculateSum(n); 
             System.out.println(n);
        }
        
        return true;     
            
    }
}