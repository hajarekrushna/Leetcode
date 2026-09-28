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
    public void reverse(ListNode curr , int size){
        ListNode prev = null;
        for(int i = 0; i < size; i++){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;
        ListNode result = null;
        ListNode prevleft = null;
        ListNode left = head;
        ListNode right = null;
        while(true){
            right = left;
            for(int i = 0; i < k-1; i++){
                if(right == null)break;
                right = right.next;
            }
            if(right!= null){
                ListNode nextleft = right.next;
                reverse(left,k);
                if(prevleft != null) prevleft.next = right;
                if(result == null) result = right;
                prevleft = left;
                left = nextleft; 
            }else{
                if(prevleft != null) prevleft.next = left;
                if(result == null) result = left;
                break;
            } 
        }
        return result;
    }
}