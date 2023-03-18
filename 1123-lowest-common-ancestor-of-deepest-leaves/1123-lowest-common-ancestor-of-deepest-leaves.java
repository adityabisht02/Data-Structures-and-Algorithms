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
        if(getHeight(root.left)==getHeight(root.right)){
            return root;
        }
        
        if(getHeight(root.left)>getHeight(root.right)){
            return lcaDeepestLeaves(root.left);
        }
        
        return lcaDeepestLeaves(root.right);
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(getHeight(root.left),getHeight(root.right));
    }
}