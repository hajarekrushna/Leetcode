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
        Stack<ListNode> s = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while(fast != null && fast.next != null){
            s.push(slow);
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        if(fast != null) slow = slow.next;
        while(!s.isEmpty()){
            if(s.pop().val != slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}