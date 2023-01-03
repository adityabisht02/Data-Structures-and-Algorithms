class KthLargest {
    //no need to store all array items in heap, store only max k items
    //on keeping minheap of size k the peek() element will be the ans
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        Arrays.sort(nums);
        if(nums.length==0){
            return;
        }
        
        //put the largest k elements into the heap, no need to add whole array to the heap
        for(int i:nums){
            int temp=add(i);
        }
    }
    
    public int add(int val) {
        //we have k largest elements, check if val is larger ,if yes then pop top element and push val
        if(pq.size()<k){
            pq.add(val);
        }
        else if(val>pq.peek()){
            pq.poll();
            pq.add(val);
            return pq.peek();
        }
        
        //else return the current k the largest element and dont add val to heap
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */