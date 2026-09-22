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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        int i=1;
        while(true){   
            if(left==1){
                return rev(temp, right-left+1);
                
            }         
            if((i+1)==left){
                ListNode revHead=rev(temp.next, right-left+1);
                temp.next=revHead;
                break;
            }
            temp=temp.next;
            i++;
        }
        return head;
    }

    public ListNode rev(ListNode head, int times){
        if(times==0){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        while(times!=0){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            times--;
        }
        head.next=curr;
        return prev;
    }
}