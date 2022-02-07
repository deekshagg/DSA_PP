
//  Definition for a binary tree node.
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class l_110 {
    public boolean isBalanced(TreeNode root) {
        // top - down approach 
        // tc = O(n^2)
        if(root == null) return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        // bottom - up approach 
        // tc = O(n)
        if(root == null) return true;
        return height(root) != -1;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int balanced_factor = Math.abs(left-right);
        if(balanced_factor > 1 || left == -1 || right == -1) return -1;
        return Math.max(left, right)+1;
    }
}