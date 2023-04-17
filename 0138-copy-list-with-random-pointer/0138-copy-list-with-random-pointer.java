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
        //set pointers
        while(ptr!=null){
            Node current=map.get(ptr);
            current.next=map.get(ptr.next);
            current.random=map.get(ptr.random);
            ptr=ptr.next;
        }
        
        return map.get(head);
    }
}