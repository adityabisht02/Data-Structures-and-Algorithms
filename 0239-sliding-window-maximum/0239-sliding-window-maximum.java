class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        if(nums.length==0){
            return ans;
        }
        
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(list.isEmpty()){
                list.offer(i);
            }
            else{
                while(!list.isEmpty() && nums[list.peekLast()]<=nums[i]){
                    list.pollLast();
                }
                list.offer(i);
            }
        }
        ans[0]=nums[list.peek()];
        
        for(int i=k;i<nums.length;i++){
            if(list.peek()<i-k+1){
                list.pollFirst();
            }
            while(!list.isEmpty() && nums[list.peekLast()]<=nums[i]){
                list.pollLast();
            }
            list.offer(i);
            ans[i-k+1]=nums[list.peek()];
        }
        
        return ans;
        
    }
}