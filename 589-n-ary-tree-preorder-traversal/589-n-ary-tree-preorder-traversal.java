/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void dfs(Node root,List<Integer> ans){
        if(root==null){
            return ;
        }
        ans.add(root.val);
        
        for(int i=0;i<root.children.size();i++){
            
            //leftmost node is dfs first
            dfs(root.children.get(i),ans);
        }
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer> preordertraversal=new ArrayList<>();
        
        if(root==null){
            return preordertraversal;
        }
        dfs(root,preordertraversal);
        
        
        return preordertraversal;
    }
}