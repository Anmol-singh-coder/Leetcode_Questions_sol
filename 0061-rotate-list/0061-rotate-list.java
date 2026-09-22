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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int len=getLength(head,k);
        if(k%len==0){
            return head;
        }
        ListNode newHead=null;
        ListNode temp=head;
        for(int i=0;i<len-k%len-1;i++){
            temp=temp.next;
        }
        newHead=temp.next;
        temp.next=null;
        return newHead;

    }
    public int getLength(ListNode head, int k){
        ListNode temp=head;
        int len=0;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        len++;
        if(k%len!=0){
            temp.next=head;
        }
        return len;
    }
}