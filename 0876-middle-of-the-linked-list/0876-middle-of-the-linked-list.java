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
    // public ListNode middleNode(ListNode head) {
    //     ListNode temp=head;
    //     int len=0;
    //     while(temp!=null){
    //         temp=temp.next;
    //         len++;
    //     }
    //     int midInd=len/2;
    //     // if((len & 1)!=0){            
    //     //     return getNode(head,midInd);
    //     // }else{
    //     //     return getNode(head,midInd+1);
    //     // }
    //     return getNode(head,midInd);
        
    // }
    // public ListNode getNode(ListNode head, int ind){
    //     while(ind!=0){
    //         head=head.next;
    //         ind--;
    //     }
    //     return head;
    // }

    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;

    }

}