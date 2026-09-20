/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       
//My approach Tried to think this by myself
        // ListNode f=head;
        // ListNode s=head;
        // while(f!=null && f.next!=null){
        //     f=f.next.next;
        //     s=s.next;
        //     if(f==s){
        //         ListNode temp=head;
        //         if(s==temp){
        //             return s;
        //         }
        //         while(temp!=s){
        //             do{
        //                 s=s.next;
        //                 if(temp==s){
        //                     return s;
        //                 }
        //             }while(s!=f);
        //             temp=temp.next;
        //         }
        //     }
        // }
        // return null;

//Kunal's Appraoch
        
        int length=findLength(head);
        if(length==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        for(int i=0;i<length;i++){
            s=s.next;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    public int findLength(ListNode head){
        ListNode f=head;
        ListNode s=head;
        int length=0;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){                
                do{
                    s=s.next;
                    length++;
                }while(s!=f);
                break;
            }
        }
        return length;
    }
}