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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return verifica(root,targetSum,0);
    }

    public boolean verifica(TreeNode root,int targetSum,int sum){
        if(root==null)
            return false;
        if(root.left==null && root.right==null && sum+root.val==targetSum) //count the current node
            return true;
        return verifica(root.left,targetSum,sum+root.val)||verifica(root.right,targetSum,sum+root.val);
    }
}