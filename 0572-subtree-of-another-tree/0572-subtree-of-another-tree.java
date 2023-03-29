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
    public boolean isSameTree(TreeNode root,TreeNode sub){
        if(root==null && sub==null){
            return true;
        }
        if((root==null && sub!=null) || (root!=null && sub==null)){
            return false;
        }
        if(root.val!=sub.val){
            return false;
        }
        
        return isSameTree(root.left,sub.left) && isSameTree(root.right,sub.right);
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        boolean same=isSameTree(root,subRoot);
        if(same){
            return true;
        }
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot) ;
    }
}