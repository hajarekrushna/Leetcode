/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> add = new HashMap<>();
        while(headA != null || headB != null){
            if(headA != null){
                if(add.containsKey(headA)) return headA;
                add.put(headA,1);
                headA = headA.next;
            }
            if(headB != null){
                if(add.containsKey(headB)) return headB;
                add.put(headB,1);
                headB = headB.next;
            }
        }
        return null;
    }
}