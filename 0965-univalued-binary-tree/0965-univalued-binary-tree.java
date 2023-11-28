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
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root==null)
            return true;
        return uniTree(root.val,root);
    }
    public boolean uniTree(int val,TreeNode root){
        if (root==null)
            return true;
        if (val!=root.val)
            return false;
        return uniTree(val,root.left) && uniTree(val,root.right);
    }
}