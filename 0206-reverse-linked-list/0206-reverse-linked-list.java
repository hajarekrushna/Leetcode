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
    public ListNode reverseList(ListNode head) {
        if(head == null)return head;
        ListNode prev = null;
        //Here we use head as current node
        while(head != null){
            ListNode nex = head.next;
            head.next = prev;
            prev = head;
            head = nex;
        }
        return prev;
    }
}