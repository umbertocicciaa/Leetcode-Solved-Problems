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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visita=new LinkedList<>();
        inOrder(root, visita);
        return visita;
    }

    private void inOrder(TreeNode a, List<Integer>l){
        if(a!=null){
            inOrder(a.left,l);
            l.add(a.val);
            inOrder(a.right,l);
        }
    }
}