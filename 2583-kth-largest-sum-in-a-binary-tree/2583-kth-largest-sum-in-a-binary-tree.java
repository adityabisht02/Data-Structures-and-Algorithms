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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            long levelSum=0;
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                levelSum+=current.val;
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            //add levelsum to pq
            pq.add(levelSum);
        }
        if(pq.size()<k){
            return -1;
        }
        //pop k-1 elements then top element will be ans
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        
        return pq.poll();
    }
}