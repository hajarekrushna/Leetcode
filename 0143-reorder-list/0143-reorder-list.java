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
    public void reorderList(ListNode head) {
        if(head.next == null)return;
        ListNode fast = head;
        ListNode slow = head;
        Stack<ListNode> s = new Stack<>();
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        while(temp != null){
            s.push(temp);
            temp = temp.next;
        }
        temp = head;
        while(!s.isEmpty()){
            ListNode temp1 = temp.next;
            temp.next = s.pop();
            temp.next.next = temp1;
            temp = temp.next.next;
        }
        return;
    }
}