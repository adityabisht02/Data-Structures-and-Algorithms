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
        List<Integer> preordertraversal=new ArrayList<>();
        
        if(root==null){
            return preordertraversal;
        }
        
        Stack<Node> s=new Stack();
        s.push(root);
        
        while(!s.isEmpty()){
            Node current=s.pop();
            preordertraversal.add(current.val);
            
            for(int i=current.children.size()-1;i>=0;i--){
                if(current.children.get(i)!=null){
                    s.push(current.children.get(i));
                }
            }
        }
        
        return preordertraversal;
    }
}