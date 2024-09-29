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
    public void reorderList(ListNode head) {
        Stack<ListNode> n = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        ListNode left = head;
        while(left!=null){
            n.push(left);
            left=left.next;
        }
        left=head;
        ListNode t;
        while(dummy!=left){
            
            dummy.next = left;
            left=left.next;
            dummy=dummy.next;
            System.out.println("current vallue: "+ dummy.val);
            t=n.pop();
            if(dummy==t){
                break;
            }
            dummy.next=t;
            dummy=dummy.next;
            System.out.println("current vallue: "+ dummy.val);
            
        }
        dummy.next = null;
        head = first.next;
    }
}