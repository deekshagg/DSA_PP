package Leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class l_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> nodestack = new Stack<>();
        Stack<Integer> sumstack = new Stack<>();
        
        nodestack.add(root);
        sumstack.add(targetSum-root.val);
        
        while(!nodestack.isEmpty()){
            TreeNode curr = nodestack.pop();
            int currsum = sumstack.pop();
            
            if(curr.left == null && curr.right == null && currsum == 0){
                return true;
            }
            if(curr.left != null) {
                nodestack.add(curr.left);
                sumstack.add(currsum-curr.left.val);
            }
            if(curr.right != null) {
                nodestack.add(curr.right);
                sumstack.add(currsum-curr.right.val);
            }
        }
        return false;
        
    }
}
