class Solution {
    public int[] twoSum(int[] nums, int target) {
        //value to index
        HashMap<Integer,Integer> map=new HashMap();
        
        //ans array
        int arr[]=new int[2];
        
        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            if(map.containsKey(num)){
                arr[0]=map.get(num);
                arr[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return arr;
        
        
        
    }
}