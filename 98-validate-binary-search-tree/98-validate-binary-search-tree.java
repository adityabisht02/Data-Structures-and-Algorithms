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
    long prev=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        
        //recursively calling left subtree
        boolean isLeftValid=isValidBST(root.left);
        
        if(root.val<=prev){
            return false;
        }
        //making prev equal to current value
        prev=root.val;
        
        boolean isRightValid= isValidBST(root.right);
        
        return isLeftValid && isRightValid;
        
         
        
    }
}