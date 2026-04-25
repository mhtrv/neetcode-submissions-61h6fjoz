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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(n);
        head = recMethod(head,dummy);
        return head;
    }

ListNode recMethod(ListNode curr,ListNode dummy){
    if(curr.next==null){
        dummy.val=dummy.val-1;
        if(dummy.val==0){
            return null;
        }else{
            return curr;
        }
    }

    curr.next=recMethod(curr.next,dummy);
    dummy.val=dummy.val-1;
    if(dummy.val==0){
        curr=curr.next;
    }
    return curr;
}
}
