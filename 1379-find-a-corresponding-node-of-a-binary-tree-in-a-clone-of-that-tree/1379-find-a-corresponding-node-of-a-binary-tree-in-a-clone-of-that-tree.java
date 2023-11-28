/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res=null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned!=null){
            if(cloned.val==target.val){
                res=cloned;
                return res;
            }
           getTargetCopy(original,cloned.left,target);
           getTargetCopy(original,cloned.right,target);     
        }
        return res;
    }
}