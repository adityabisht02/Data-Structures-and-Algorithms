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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Integer> ans=new ArrayList<>();
        
        if(root==null){
            return ans;
        }
     
        
        while(!q.isEmpty()){
            
            int size=q.size();
            int rowmax=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
            TreeNode current=q.poll();
                
                if(current.val>rowmax){
                    rowmax=current.val;
                }
            
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            } 
            }
            
            ans.add(rowmax);
           
        }
        
        return ans;
    }
}