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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        int maxIndex=0; //store max index
        int index=1;
        while(!q.isEmpty()){
            int size=q.size();
            int levelSum=0;
            //traverse through one level
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                levelSum+=current.val;
                //add left and right children
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            if(levelSum>max){
                max=levelSum;
                maxIndex=index;
            }
            index++;            
        }
        return maxIndex;
    }
}