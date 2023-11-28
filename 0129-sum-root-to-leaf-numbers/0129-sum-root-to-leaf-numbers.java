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
    private List<String>l=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        buildNumber(root,new StringBuilder());
        int sum=0;
        for(String x:l){
            int y=Integer.parseInt(x);
            sum+=y;
        }
        return sum;
    }
    public void buildNumber(TreeNode root,StringBuilder s){
        if(root==null)
            return;
        s.append(root.val);
        if(root.left==null && root.right==null){
            l.add(s.toString());
            return;
        }
        buildNumber(root.left,new StringBuilder(s));
        buildNumber(root.right,new StringBuilder(s));
    }
}