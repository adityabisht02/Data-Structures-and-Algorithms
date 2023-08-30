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
     public int maxPath(TreeNode root,int max[]){
        if(root==null){
            return 0;
        }
        int left=maxPath(root.left,max);
        int right=maxPath(root.right,max);
        if(left<0){
            left=0;
        }
        if(right<0){
            right=0;
        }
        max[0]=Math.max(max[0],root.val+left+right);
        return Math.max(left,right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
         if(root==null){
             return 0;
         }
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        int res=maxPath(root,max);
        return max[0];
    }
}