class Solution {
    public int sum(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        return count;
    }
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //if not posible return -1
         if(sum(gas) <sum(cost)){
             return -1;
         }
        //now we know solution exists 
        int index=0;
        int sum=0;
        // traverse arr once, wherever sum remains positiv till end return that startingIndex
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            //if sum goes less than 0 reset sum
            if(sum<0){
                sum=0;
                index=i+1;;
            }
           
        }
        
        return index;
    }
}