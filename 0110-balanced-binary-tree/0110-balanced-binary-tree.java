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
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=getHeight(root.left);
        int rh=getHeight(root.right);
        if(lh-rh>1 || rh-lh>1){
         return false;   
        }        
        boolean isLeftBalanced=isBalanced(root.left);
        boolean isRightBalanced=isBalanced(root.right);
        
        return (isLeftBalanced && isRightBalanced);
        
    }
}