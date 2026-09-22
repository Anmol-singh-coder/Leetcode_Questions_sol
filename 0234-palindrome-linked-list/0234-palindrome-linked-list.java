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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=getMid(head);
        ListNode revHead=rev(mid);
        return compare(head, revHead);
        
    }
    public ListNode getMid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode rev(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;            
        }
        return prev;
    }

    public boolean compare(ListNode head1, ListNode head2){
        while(head1!=null && head2!=null){
            if(head1.val!=head2.val){
                return false;                
            }
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
}