/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode following=curr.next;
        while(following!=null){
            curr.next=prev;
            prev=curr;
            curr=following;
            following=following.next;
        }
        curr.next=prev;
        return curr;
    }
}