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
    public void dfs(TreeNode root,int k, List<Integer> list){
        if(root==null){
            return ;
        }
        dfs(root.left,k,list);
        list.add(root.val);
        dfs(root.right,k,list);
        
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        
        dfs(root,k,list);
        
        int low=0,high=list.size()-1;
        
        while(low<high){
            if(list.get(low)+list.get(high)==k){
                return true;
            }
            else if(list.get(low)+list.get(high)>k){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}