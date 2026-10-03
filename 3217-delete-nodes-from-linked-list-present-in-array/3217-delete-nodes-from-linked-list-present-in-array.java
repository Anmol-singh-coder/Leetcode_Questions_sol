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
    public ListNode modifiedList(int[] arr, ListNode head) {
        Arrays.sort(arr);
        ListNode curr=head;
        ListNode dummyHead=new ListNode();
        ListNode prev=dummyHead;
        while(curr!=null){
            if(BS(arr,curr.val)){
                prev.next=curr.next;
            }else{
                prev.next=curr;
                prev=prev.next;
            }
            curr=curr.next;
        }

        return dummyHead.next;

    }

    boolean BS(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}