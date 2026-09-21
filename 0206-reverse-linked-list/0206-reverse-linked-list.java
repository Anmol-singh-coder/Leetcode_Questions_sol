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
        if(head==null || head.next==null){
            return head;
        }
        // return reverse(head);
        return reverseIteration(head);
    }

    // public ListNode reverse(ListNode node){
    //     if(node.next==null){
    //         return node;
    //     }
    //     ListNode head=reverse(node.next);
    //     ListNode prev = node.next;
    //     prev.next=node;
    //     node.next=null;
    //     return head;
    // }

    public ListNode reverseIteration(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

}