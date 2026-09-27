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
        if(left == right) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = null;
        ListNode before = null;
        int pos = 1;
        while(pos < left){
            before = curr;
            curr = curr.next;
            pos++;
        }
        for(int i = 0; i < right - left + 1; i++){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;  
        }
         if (before == null) {
            head.next = nex;  //if left = 1 that is before = null;
            head = prev;
        } else {
            before.next.next = nex;
            before.next = prev;
        }
       
        return head;
    }
}