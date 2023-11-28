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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
      }
    public TreeNode createBST(int []numbs,int start,int end){
        if(start>end)
            return null;
        int med=(end+start)/2;
        TreeNode root=new TreeNode(numbs[med]);
        root.left=createBST(numbs,start,med-1);
        root.right=createBST(numbs,med+1,end);
        return root;
    }
}