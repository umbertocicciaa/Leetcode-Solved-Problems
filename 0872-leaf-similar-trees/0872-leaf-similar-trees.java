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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        riempiFoglie(a,root1);
        riempiFoglie(b,root2);
        if(a.size()!=b.size())
            return false;
        Iterator<Integer> ait = a.iterator();
        Iterator<Integer> bit = b.iterator();
        while(ait.hasNext()){
            Integer x=ait.next();
            Integer y=bit.next();
            if(!x.equals(y))
                return false;
        }
        return true;
    }
    public void riempiFoglie(ArrayList<Integer>l,TreeNode a){
        if(a==null)
            return;
        if(a.left==null && a.right==null)
            l.add(a.val);
        riempiFoglie(l,a.left);
        riempiFoglie(l,a.right);
    }
}