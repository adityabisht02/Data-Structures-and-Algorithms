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
    public TreeNode rec(int postIndex,int inStart,int inEnd,int inorder[],int postorder[]){
        if(postIndex<0 || inStart>inEnd){
            return null;
        }
        TreeNode newnode=new TreeNode(postorder[postIndex]);
        int index=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==postorder[postIndex]){
                index=i;
                break;
            }
        }
        newnode.right=rec(postIndex-1,index+1,inEnd,inorder,postorder);
        newnode.left=rec(postIndex-(inEnd-index+1),inStart,index-1,inorder,postorder);
            
            return newnode;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return rec(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }
}