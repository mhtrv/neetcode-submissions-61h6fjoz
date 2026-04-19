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
        head=recReverseList(head);
        return head;
    }

    public ListNode recReverseList(ListNode curr) {
        if(curr==null || curr.next==null){
            return curr;
        }

        ListNode revHead=recReverseList(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return revHead;
    }
}
