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
    public TreeNode rec(int preIndex,int inStart,int inEnd,int preorder[],int inorder[]){
        if(preIndex>=preorder.length || inStart>inEnd){
            return null;
        }
        TreeNode newnode=new TreeNode(preorder[preIndex]);
        //find left and right subtrees using inorder array
        int index=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==preorder[preIndex]){
                index=i;
                break;
            }
        }
        //now call for left subtree and right subtree
        newnode.left=rec(preIndex+1,inStart,index-1,preorder,inorder);
        newnode.right=rec(preIndex+index-inStart+1,index+1,inEnd,preorder,inorder);
        
        return newnode;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return rec(0,0,inorder.length-1,preorder,inorder);
    }
}