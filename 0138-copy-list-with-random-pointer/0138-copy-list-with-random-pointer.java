/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        map.put(null,null);
        
        Node ptr=head;
        while(ptr!=null){
            Node newnode=new Node(ptr.val);
            map.put(ptr,newnode);
            ptr=ptr.next;
        }
        
        ptr=head;
        
        while(ptr!=null){
            map.get(ptr).next=map.get(ptr.next);
            map.get(ptr).random=map.get(ptr.random);
            
            ptr=ptr.next;
        }
        
        return map.get(head);
        
    }
}