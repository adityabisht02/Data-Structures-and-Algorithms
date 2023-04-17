/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        //if node null return null
        if(node==null){
            return null;
        }
        
       //do bfs and add all nodes to hashmap of old to new nodes
        // then do bfs again and add children
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        Map<Node,Node> map=new HashMap<>();
       
        
        while(!q.isEmpty()){
            Node current=q.poll();
            //create new node
            Node newnode=new Node(current.val);
            //add both to hashmap
            map.put(current,newnode);
            //add children of current to queue
            for(int i=0;i<current.neighbors.size();i++){
                Node currentchild=current.neighbors.get(i);
                //if child hasnt been visited add it to queue
                if(!map.containsKey(currentchild)){
                   q.add(currentchild); 
                }
            }
            
        }
        
        HashSet<Node> visited=new HashSet();
        q=new LinkedList<>();
        q.add(node);
        visited.add(node);
        
        //now do bfs again to make connections
           while(!q.isEmpty()){
            Node current=q.poll();
            //traverse children
               for(int i=0;i<current.neighbors.size();i++){
                   Node child=current.neighbors.get(i);
                   map.get(current).neighbors.add(map.get(child));
                   //to the queue we will only add nodes which are not visited
                   if(!visited.contains(child)){
                        q.add(child);
                   visited.add(child);
                   }
                  
               }
            
            
        }
        
        return map.get(node);
    }
}