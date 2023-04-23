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
        if(root==null)return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        HashMap<TreeNode,Integer> map=new HashMap<>();
        map.put(root,0);
        int maxWidth=0;
        
        while(!q.isEmpty()){
            //get size of the current level
            int size=q.size();
            int leftMostIndex=0,rightMostIndex=0;
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                int index=map.get(current);
                if(current.left!=null){
                    q.add(current.left);
                    int leftChildIndex=(2*index)+1-1;
                    map.put(current.left,leftChildIndex);
                    
                }
                if(current.right!=null){
                    q.add(current.right);
                    int rightChildIndex=(2*index)+2-1;
                    map.put(current.right,rightChildIndex);
                    
                }
                if(i==0){
                    leftMostIndex=index;
                }
                if(i==size-1){
                    rightMostIndex=index;
                }
              
            }
              if(rightMostIndex-leftMostIndex+1>maxWidth){
                    maxWidth=rightMostIndex-leftMostIndex+1;
                }
        }
        return maxWidth;
    }
}