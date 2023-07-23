/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} preorder
 * @param {number[]} inorder
 * @return {TreeNode}
 */
var buildTree = function(preorder, inorder) {
    // scan the preorder tree, for each node in the array:
        // find it in inorder array 
        // construct the current node first
        // construct the left sub-tree
        // construct the right sub-tree
    // we need connections between two input array

    var map = {};
    var i = 0;
    inorder.forEach((item, index) => {
        map[item] = index;
    });
    // 9: 0
    // 3: 1
    // 15: 2

    var constructor = function(left, right) {
        var currentNodeValue = preorder[i];
        // preorder build
        var currentNodeIndex = map[currentNodeValue];
        var currentNode = new TreeNode(currentNodeValue);
        if(left < currentNodeIndex) {
            i++;
            currentNode.left = constructor(left, currentNodeIndex - 1);
        }
        if(right > currentNodeIndex) {
            i++;
            currentNode.right = constructor(currentNodeIndex + 1, right);
        }
        return currentNode;
    }

    return constructor(0, inorder.length - 1);
};