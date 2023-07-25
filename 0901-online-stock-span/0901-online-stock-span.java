class StockSpanner {
    List<Integer> list;
    public StockSpanner() {
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        int ans=1;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>price){
                break;
            }
            ans++;
        }
        list.add(price);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */