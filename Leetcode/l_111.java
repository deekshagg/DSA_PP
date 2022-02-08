import java.util.*;
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

class l_111 {
    public int minDepth(TreeNode root) {
        // DFS Solution
        // time_complexity is O(n) where n is the number of nodes
        // space_complexity is O(height of tree)
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left == null) return minDepth(root.right) + 1;
        if(root.right ==  null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left) , minDepth(root.right)) + 1;
    }
}
class Solution {
    // BFS Solution
        // time_complexity is O(n) where n is the number of nodes
        // space_complexity is O(height of tree)
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>(); // ArrayDeque bhi ho skta 
        q.add(root);
        int depth = 1;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                root = q.poll(); // remove wala
                if(root.left ==  null && root.right == null)
                    return depth;
                if(root.left != null)
                    q.add(root.left);
                if(root.right != null)
                    q.add(root.right);
            }
            depth++;
        }
        return 0;
    }
}