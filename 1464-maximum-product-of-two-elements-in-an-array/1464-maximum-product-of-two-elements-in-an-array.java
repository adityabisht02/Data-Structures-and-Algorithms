class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:nums){
            pq.add(i);
        }
        
        //get max 2 elements
        int t1=pq.poll();
        int t2=pq.poll();
        
        return (t1-1)*(t2-1);
    }
}