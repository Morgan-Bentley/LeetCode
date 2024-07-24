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
    ListNode node = new ListNode(0);
    ListNode head = node;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null) {
            while (list2 != null) {
            node.next = list2;
            node = node.next;
            list2 = list2.next;
            }
            while (list1 != null) {
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            }
        } else if(list1.val >= list2.val) {
            node.next = list2;
            node = node.next;
            list2 = list2.next;
            mergeTwoLists(list1,list2);
        } else {
            node.next = list1;
            node = node.next;
            list1 = list1.next;
            mergeTwoLists(list1,list2);
        }
        
        return head.next;
    }
}