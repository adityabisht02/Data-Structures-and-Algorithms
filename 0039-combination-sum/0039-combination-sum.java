class Solution {
    public void rec(List<List<Integer>> ans,List<Integer> ds,int arr[],int index,int target){
        if(index>=arr.length){
           if(target==0){
               ans.add(new ArrayList<>(ds));
               
           }return ;
        }
       
        //if less than target we add the element and go further
        if(arr[index]<=target){
            ds.add(arr[index]);
            rec(ans,ds,arr,index,target-arr[index]);
            ds.remove(ds.size()-1);
        }
        //arr[index]> target then move on to next element
        rec(ans,ds,arr,index+1,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        rec(ans,new ArrayList<>(),candidates,0,target);
        
        return ans;
    }
}