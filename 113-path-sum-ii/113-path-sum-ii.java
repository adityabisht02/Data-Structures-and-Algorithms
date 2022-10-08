/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    
    public void dfs(TreeNode root,int target,List<List<Integer>> ans,List<Integer> list){
        if(root==null){
            return ;
        }
       
       list.add(root.val);
        
        if(root.left==null && root.right==null){
            if(target-root.val==0){
            ans.add(list);
            
            }
         return ;
        }
       
        
        dfs(root.left,target-root.val,ans,new ArrayList(list));
        
        dfs(root.right,target-root.val,ans,new ArrayList(list));
        
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        
        if(root==null){
            return ans;
        }
        dfs(root,targetSum,ans,new ArrayList<>());
        
        return ans;
        
    }
}