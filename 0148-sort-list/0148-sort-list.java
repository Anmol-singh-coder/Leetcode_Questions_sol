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
    public ListNode sortList(ListNode head) {
    //     int length=getLength(head);          //Trying to use BUBBLE SORT  BY my own :)
    //     if(length==0){
    //         return null;
    //     }

    //     //Trying Bubble Sort in Linked List
    //     ListNode timePass=head;
    //     for(int i=0;i<length-1;i++){
    //         timePass=timePass.next;
    //         for(int j=0;j<length-i-1;j++){
    //             ListNode f=timePass;
    //             ListNode s=timePass.next;
    //             if(f.val>s.val){
    //                 swap(f,s);
    //             }
    //         } 
    //     }
    //     return head;
        
        
    // }
    // public void swap(ListNode f, ListNode s){
    //     ListNode temp=f;
    //     f.next=s.next;
    //     s.next=f;
             
    // }

    // public int getLength(ListNode head){
    //     int length=1;
    //     ListNode temp=head;
    //     while(temp!=null){
    //         length++;
    //         temp=temp.next;
    //     }
    //     return length;

//Merge Sort 
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
    public ListNode getMid(ListNode head){
        ListNode f = head;
        ListNode s = head;
        ListNode prevS=null;
        while(f!=null && f.next!=null){
            prevS=s;
            f=f.next.next;
            s=s.next;

        }
        prevS.next=null;
        return s;
    }
    public ListNode merge(ListNode l1, ListNode l2){
            ListNode head=new ListNode();
            ListNode current=head;
            while(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    current.next=l1;
                    l1=l1.next;
                }else{
                    current.next=l2;
                    l2=l2.next;
                }
                current=current.next;
               
            }
            current.next=(l1!=null)?l1:l2;
            return head.next;
    }

}