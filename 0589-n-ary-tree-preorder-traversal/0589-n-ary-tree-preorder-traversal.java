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
    public void dfs(List<Integer> ans,Node root){
        if(root==null){
            return ;
        }
        List<Node> children=root.children;
        ans.add(root.val);
        //now traverse childeen
        for(int i=0;i<children.size();i++){
            dfs(ans,children.get(i));
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        dfs(ans,root);
        return ans;
    }
}