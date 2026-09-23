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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int len=getLength(head);
        int times=len/k;

        ListNode prev = new ListNode();
        prev.next=head;
        ListNode newHead=prev;
        
        for(int i=0;i<times;i++){
            prev=rev(prev.next,prev,k);
        }

        return newHead.next;
    }
    public ListNode rev(ListNode head, ListNode prev, int k){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevCurr=null;
        ListNode curr=head;
        for(int i=0;i<k;i++){
            ListNode next=curr.next;
            curr.next=prevCurr;
            prevCurr=curr;
            curr=next;
        }
        head.next=curr;
        prev.next=prevCurr;
        return head;
    }

    public int getLength(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}