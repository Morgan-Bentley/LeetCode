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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        Stack<Integer> s=new Stack<>();
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            s.add(slow.val);
            slow=slow.next;
        }
        slow=head;
        while(!s.isEmpty()){
            int val = s.pop();
            if(val!=slow.val){
                return false;
            }
            slow=slow.next;
        }
        return true;
    }
}