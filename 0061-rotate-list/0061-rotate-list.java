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
        if(head == null || head.next == null)return head;
        ListNode temp1 = head;
        ListNode temp2 = temp1;
        int count = 0;
        while(temp2 != null){
            temp2 = temp2.next;
            count++;
        }
        for(int i = 0; i < k%count; i++){
            while(temp1.next != null){
                temp2 = temp1;
                temp1 = temp1.next;
            }
            temp1.next = head;
            head = temp1;
            temp2.next = null;
        }
        return temp1;
    }
}