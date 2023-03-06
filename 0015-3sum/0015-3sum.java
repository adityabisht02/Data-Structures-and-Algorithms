class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        HashSet<List<Integer>> set=new HashSet();
        
        for(int i=0;i<nums.length-2;i++){
            int target=-(nums[i]);
            int low=i+1,high=nums.length-1;
            
            while(low<high){
                if(nums[low]+nums[high]==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    set.add(list);
                    low++;
                    high--;
                }
                else if(nums[low]+nums[high] <target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        
        return new ArrayList<>(set);
        
        
    }
}