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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=null;
        ListNode head=null;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(list3==null){
                    list3=new ListNode(list1.val);
                    head=list3;
                }else{
                    list3.next=new ListNode(list1.val);
                    list3=list3.next;
                }
                list1=list1.next;
            }else{
                if(list3==null){
                    list3=new ListNode(list2.val);
                    head=list3;
                }else{
                    list3.next=new ListNode(list2.val);
                    list3=list3.next;
                }
                list2=list2.next;
            }
        }

        while(list1!=null){
            if(list3==null){
                list3=new ListNode(list1.val);
                head=list3;
            }else{
                list3.next=new ListNode(list1.val);
                list3=list3.next;
            }
            list1=list1.next;
        }

        while(list2!=null){
            if(list3==null){
                list3=new ListNode(list2.val);
                head=list3;
            }else{
                list3.next=new ListNode(list2.val);
                list3=list3.next;
            }
            list2=list2.next;
        }

        return head;
    }
}