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
    int max=Integer.MIN_VALUE;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return max;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        int diameter=left+right;
        if(diameter>max){
            max=diameter;
        }
        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        
        return max;
        
    }
}