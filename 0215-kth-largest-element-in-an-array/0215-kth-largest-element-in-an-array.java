class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        //pop k-1 elements
        for(int i=1;i<=k-1;i++){
            int temp=pq.poll();
        }
        
        
        return pq.poll();
    }
}