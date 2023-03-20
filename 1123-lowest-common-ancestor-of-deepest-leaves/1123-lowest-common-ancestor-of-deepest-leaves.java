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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int leftHeight=height(root.left);
        int right=height(root.right);
        
        if(leftHeight==right){
            return root;
        }
        else if(leftHeight>right){
            return lcaDeepestLeaves(root.left);
        }
        
        
        return lcaDeepestLeaves(root.right);
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
}