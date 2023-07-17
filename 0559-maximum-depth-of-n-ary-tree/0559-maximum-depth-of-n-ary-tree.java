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
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        List<Node> children=root.children;
        int max=0;
        for(int i=0;i<children.size();i++){
            int height=maxDepth(children.get(i));
            max=Math.max(max,height);
        }
        return 1+max;
    }
}