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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pot=new LinkedList<>();
        postOrder(root,pot);
        return pot;
    }
    public void postOrder(TreeNode root, List<Integer>l){
        if (root!=null){
            postOrder(root.left,l);
            postOrder(root.right,l);
            l.add(root.val);
        }
    }
}