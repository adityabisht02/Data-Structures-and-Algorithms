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
    public int widthOfBinaryTree(TreeNode root) {
        HashMap<TreeNode,Integer> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        map.put(root,0);
        int maxWidth=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            int leftIndex=0,rightIndex=0;
            for(int i=0;i<size;i++){
                 TreeNode currentNode=q.poll();
          
            int index=map.get(currentNode);
                if(currentNode.left!=null){
                      int leftChildIndex=(2*index)+1-1;
                    q.add(currentNode.left);
                    map.put(currentNode.left,leftChildIndex);
                }
               if(currentNode.right!=null){
                      int rightChildIndex=(2*index)+2-1;
                    q.add(currentNode.right);
                    map.put(currentNode.right,rightChildIndex);
                }
                
                if(i==0){
                    leftIndex=index;
                }
                if(i==size-1){
                    rightIndex=index;
                }
                
            }
            maxWidth=Math.max(maxWidth,rightIndex-leftIndex+1);
           
        }
        
        return maxWidth;
    }
}