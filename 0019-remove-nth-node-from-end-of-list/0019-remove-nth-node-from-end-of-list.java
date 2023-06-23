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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode current = head;
        int size = 0;
        ListNode prev = head;
        while(current != null){
            current = current.next;
            size++;
        }
        
        if(size>1 && size-n ==0){
            head = head.next;
        }
        
        if(size ==1 && n ==1){
            return null;
        }
        
        if(size ==1 && n==0){
            return head;
        }
        
        for(int i = 1;i<=size-(n+1);i++){
            prev = prev.next;   
        }
         prev.next = prev.next.next;
        return head;
    }
}