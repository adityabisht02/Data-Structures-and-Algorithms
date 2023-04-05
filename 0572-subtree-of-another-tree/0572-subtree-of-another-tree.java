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
    public boolean dfs(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if((root==null && subRoot!=null) || (root!=null && subRoot==null)){
            return false;
        }
        if(root.val!=subRoot.val){
            return false;
        }
        return dfs(root.left,subRoot.left) && dfs(root.right,subRoot.right);
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //traverse root tree and when u find root==subroot do dfs to check whole subtree
        if(root==null){
            return false;
        }
       boolean ans=dfs(root,subRoot);
        
        return ans || (isSubtree(root.left,subRoot)) || isSubtree(root.right,subRoot) ;
    }
}