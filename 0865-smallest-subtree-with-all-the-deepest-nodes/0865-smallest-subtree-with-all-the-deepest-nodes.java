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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null){
            return root;
        }
        int leftSubtreeHeight=getHeight(root.left);
        int rightSubtreeHeight=getHeight(root.right);
        
        //if both subtree equal then all deepest nodes accounted for
        if(leftSubtreeHeight==rightSubtreeHeight){
            return root;
        }
        //if left subtree bigger then go to left subtree
        else if(leftSubtreeHeight>rightSubtreeHeight){
            return subtreeWithAllDeepest(root.left);
        }
        //else we go deeper in right subtree
        
        return subtreeWithAllDeepest(root.right);
    }
}