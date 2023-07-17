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
    public List<Integer> postorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Stack<Node> s=new Stack();
        s.push(root);
        while(!s.isEmpty()){
            Node current=s.pop();
            List<Node> children=current.children;
            ans.add(current.val);
            for(int i=0;i<children.size();i++){
                s.push(children.get(i));
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}