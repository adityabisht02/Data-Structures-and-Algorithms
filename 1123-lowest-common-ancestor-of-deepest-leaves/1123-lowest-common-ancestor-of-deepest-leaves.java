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
        return 1+ Math.max(getHeight(root.left),getHeight(root.right));
    }
    
    public boolean contains(TreeNode root,List<TreeNode> leaves){
        
        for(int i=0;i<leaves.size();i++){
            if(root==leaves.get(i)){
                return true;
            }
        }
        return false;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root,List<TreeNode> leaves){
        if(root==null || contains(root,leaves)){
            return root;
        }
       TreeNode left= lowestCommonAncestor(root.left,leaves);
    TreeNode right= lowestCommonAncestor(root.right,leaves);
        
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root.left==null && root.right==null){
            return root;
        }
        //get height
        int height=getHeight(root);
        
        
        //create a queue for bfs to get leaf nodes
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int currentlevel=0;
        //list for storing leaves
        List<TreeNode> leaves=new ArrayList<>();
        
        while(!q.isEmpty()){
            currentlevel++;
            
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                if(currentlevel==height){
                    leaves.add(current);
                }
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
        }
        
        //now find lcs
        
        return lowestCommonAncestor(root,leaves);
    }
}