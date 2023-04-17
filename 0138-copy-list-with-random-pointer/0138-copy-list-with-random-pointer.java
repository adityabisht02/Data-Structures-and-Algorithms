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
        //first traverse the old list and add old and new nodes to a hashmap of oldtonew nodes
        //then traverse old list again and make connections using nodes in hashmap        
        
        Map<Node,Node> oldToNew=new HashMap<Node,Node>();
        //Node for traversing list
        Node ptr=head;
        while(ptr!=null){
            Node newnode=new Node(ptr.val);
            //put the old and new node
            oldToNew.put(ptr,newnode);
            ptr=ptr.next;
        }
        //need to add null as well
        oldToNew.put(null,null);
        
        //traverse again to make connections
        ptr=head;
        while(ptr!=null){
            Node current=oldToNew.get(ptr);
            current.next=oldToNew.get(ptr.next);
            current.random=oldToNew.get(ptr.random);
            ptr=ptr.next;
        }
        
        return oldToNew.get(head);
    }
}