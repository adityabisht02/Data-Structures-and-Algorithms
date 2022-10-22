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
    int diameter=0;
    public int getheight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getheight(root.left),getheight(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=getheight(root.left);
        int rh=getheight(root.right);
        
        if(lh+rh>diameter){
            diameter=lh+rh;
        }
        
        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        
        return diameter;
    }
}