Approach 1:
1. Find height
2. Use height and bfs to get all leaf nodes
3. Use recursive method to get LCA based on leaf nodes
​
Approach 2:
1. If a node has left and right subtree height as equal (means both left and right subtree are going to deepes node since height is equal), then that node is LCA.
2. If not that node, go in the subtree with greater height.