class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //use greedy approach
        // u do not care about the actual number of bars but simply how many different bars u can buy
        
        Arrays.sort(costs);
        if(costs[0]>coins){
            return 0;
        }
        int iceCreamBars=0;
        
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                iceCreamBars++;
                coins-=costs[i];
            }
        }
        
        return iceCreamBars;
    }
}