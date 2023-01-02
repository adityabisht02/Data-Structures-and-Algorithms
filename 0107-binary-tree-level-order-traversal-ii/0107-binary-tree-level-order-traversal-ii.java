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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levels=new ArrayList<>();
        if(root==null){
            return levels;
        }
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currentNode=q.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.offer(currentNode.right);
                }
                
            }
            
            levels.add(currentLevel);            
        }
        
        //reverse the levels list
        int n=levels.size();
        
        for(int i=0;i<n/2;i++){
            
            List<Integer> tempList=levels.get(n-i-1);
            levels.set(n-i-1,levels.get(i));
            levels.set(i,tempList);
        }
        
        return levels;
    }
}