class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,buyingprice=prices[0];
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyingprice){
                buyingprice=prices[i];
            }
            else if(prices[i]-buyingprice>profit){
                profit=prices[i]-buyingprice;
            }
        }
        
        return profit;
    }
}