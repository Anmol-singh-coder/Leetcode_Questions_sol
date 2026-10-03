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
    public ListNode removeNodes(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode revHead=reverse(head);
        
        int maxValue=revHead.val;
        ListNode temp=revHead.next;
        ListNode prev=revHead;
        while(temp!=null){
            if(temp.val<maxValue){
                prev.next=temp.next;
                temp=prev.next;
            }else{
                maxValue=temp.val;
                temp=temp.next;
                prev=prev.next;
            }
            
        }
        
        return reverse(revHead);

    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
}