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
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow=head;
                break;
            }
        }
        
        if(fast==null || fast.next==null){
            return null;
        }
        
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}