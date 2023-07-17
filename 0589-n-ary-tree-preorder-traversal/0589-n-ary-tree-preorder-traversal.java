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
    public List<Integer> preorder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        Stack<Node> s=new Stack();
        s.push(root);
        while(!s.isEmpty()){
            Node current=s.pop();
            ans.add(current.val);
            List<Node> children=current.children;
            for(int i=children.size()-1;i>=0;i--){
                s.push(children.get(i));
            }
        }
        return ans;
    }
}