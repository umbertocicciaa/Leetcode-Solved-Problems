/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode behind=head;
        ListNode node=head;
        
        while(node != null && node.next!=null){
            behind=behind.next;
            node=node.next.next;
            if(behind == node)
                return true;
        }
        
        return false;
        
    }
}