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
    public int averageOfSubtree(TreeNode root) {
        if(root == null)
            return 0;
        int media=calcolaMedia(root);
        if(media==root.val)
            return 1+averageOfSubtree(root.left)+averageOfSubtree(root.right);
        else
            return averageOfSubtree(root.left)+averageOfSubtree(root.right);
    }
    
    public int calcolaMedia(TreeNode root){
        int somma=somma(root);
        int numeroNodi=conta(root);
        return somma/numeroNodi;
    }

    public int somma(TreeNode root){
        if(root==null)
            return 0;
        return root.val+somma(root.left)+somma(root.right);
    }

    public int conta(TreeNode root){
        if(root==null)
            return 0;
        return 1+conta(root.left)+conta(root.right);
    }
}