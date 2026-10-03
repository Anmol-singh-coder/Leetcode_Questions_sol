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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummyHead=new ListNode();
        ListNode prev=dummyHead;
        prev.next=head;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            
            prev.next=curr.next;
            curr.next=curr.next.next;
            prev.next.next=curr;
            prev=curr;
            curr=curr.next;
        }


        return dummyHead.next;
    }
}