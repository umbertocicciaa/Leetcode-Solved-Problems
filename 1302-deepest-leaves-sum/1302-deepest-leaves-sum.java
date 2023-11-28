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
    public int deepestLeavesSum(TreeNode root) {
        int height=findHeight(root);
        return deepestSum(height,0,root);
    }

    public int findHeight(TreeNode root){
        if (root==null)
            return 0;
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }

    public int deepestSum(int maxH,int l,TreeNode root){
        if(root==null)
            return 0;
        if(l+1==maxH){ //+1 for count this level
            return root.val;
        }
        return deepestSum(maxH,l+1,root.left)+deepestSum(maxH,l+1,root.right);
    }
}