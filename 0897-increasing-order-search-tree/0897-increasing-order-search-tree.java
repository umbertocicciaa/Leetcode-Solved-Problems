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
    public TreeNode increasingBST(TreeNode root) {
      ArrayList<Integer>al=inOrder(root,new ArrayList<>());
      TreeNode res=new TreeNode();
      TreeNode cur=res;
      for(int i:al){
          cur.right=new TreeNode(i);
          cur=cur.right;
      }
      return res.right;
    }
    private ArrayList<Integer>inOrder(TreeNode root,ArrayList<Integer>l){
        if(root==null)return l;
        inOrder(root.left,l);
        l.add(root.val);
        inOrder(root.right,l);
        return l;
    }
}