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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head = new ListNode();
        ListNode list = head;
        boolean onlyOnce=true;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                insert(list,list1.val);
                list1=list1.next;
                list=list.next;
                
            }else{
                insert(list,list2.val);
                list2=list2.next;
                list=list.next;
            }
            if(onlyOnce){
                head=list;
                onlyOnce=false;
            }
            
        }
        while(list1!=null){
            insert(list,list1.val);
            list1=list1.next;
            list=list.next;
        }
        while(list2!=null){
            insert(list,list2.val);
            list2=list2.next;
            list=list.next;
        }
        return head;
    }

    //Inserting a Node in the last of a Linked List
    public void insert(ListNode list, int val){
        ListNode node = new ListNode(val);
               
        list.next=node;
        
    }
    
}