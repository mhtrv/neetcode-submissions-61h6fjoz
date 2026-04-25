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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse the linkedlIntStream
        // Handle scenario of diff sized lists
        //ListNode node1=recMethod(l1);
        //ListNode node2=recMethod(l2);
        ListNode node1=l1;
        ListNode node2=l2;
        int length1=0;
        int length2=0;
        ListNode curr;
        curr=node1;
        while(curr!=null){
            length1++;
            curr=curr.next;
        }
        curr=node2;
        while(curr!=null){
            length2++;
            curr=curr.next;
        }
        //System.out.println("length of first LinkedList"+length1);
        //System.out.println("length of first LinkedList"+length2);
        if(length1>length2){
            node2=incLength(node2,length1-length2);
        }
        if(length2>length1){
            node1=incLength(node1,length2-length1);
        }
        ListNode output=null;
        int balance=0;
        while(node1!=null){
            int val=node1.val+node2.val+balance;
            //System.out.println("balance is"+balance);
            //System.out.println("node1 is"+node1.val);
            //System.out.println("node2 is"+node2.val);
            //System.out.println("val is"+val);
            ListNode node;
            if(val<=9){
                balance=0;
                node=new ListNode(val);
            }else{
                String valString = ""+val;
                balance=Integer.parseInt(""+valString.charAt(0));
                node=new ListNode(Integer.parseInt(""+valString.charAt(1)));
            }
            node.next=output;
            output=node;
            node1=node1.next;
            node2=node2.next;
        }
        
        ListNode node3=new ListNode(balance);
        if(balance>0){
            node3.next=output;
            output=node3;
        }
        return recMethod(output);
    }

    private ListNode recMethod(ListNode curr){
        if(curr.next==null){
            return curr;
        }
        ListNode retVal=recMethod(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return retVal;
    }

    private ListNode incLength(ListNode curr, int length){
        ListNode curr2=curr;
        while(curr2.next!=null){
            curr2=curr2.next;
        }
        while(length>0){
            ListNode node=new ListNode(0);
            curr2.next=node;
            curr2=curr2.next;
            length--;
        }
        return curr;
    }
}
