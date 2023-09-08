class Solution {
    public void helper(int nums[],List<List<Integer>> ans,int visited[],List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==1){
                continue;
            }
            list.add(nums[i]);
            visited[i]=1;
            helper(nums,ans,visited,list);
            visited[i]=0;
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int visited[]=new int[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,ans,visited,new ArrayList<>());
        return ans;
    }
}